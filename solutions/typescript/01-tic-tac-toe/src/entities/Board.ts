class InvalidBoxNameError extends Error {
    message = 'Invalid box identifier';
}

const BOARD_DEFAULT_SIZE = 3
const ROWS = "ABCDEFGHIJ"

export class Board {
    size!: number
    grid!: Array<Array<string>>


    constructor(size: number = BOARD_DEFAULT_SIZE) {
        this.size = size
        this.grid = []
        for (let i = 0; i < size; i++) {
            this.grid.push(new Array(size).fill("_"))
        }
    }

    getBoardForDisplay(): string {
        const displayRows = []
        for (let row of this.grid) {
            displayRows.push(row.join('\t'))
        }
        return displayRows.join('\n')
    }

    markBoard(box: string, character: string): boolean {
        // box: A1 or B2 like that
        if (box.length != 2) {
            throw new InvalidBoxNameError()
        }
        const row = ROWS.indexOf(box.charAt(0))
        const col = Number(box.charAt(1)) - 1

        if (row < 0 || row >= this.size || col < 0 || col >= this.size) {
            throw new InvalidBoxNameError()
        }

        if (this.grid[row][col] != "_") {
            return false
        }

        this.grid[row][col] = character
        return true
    }

    getRowAsString(rowName: string): string {
        const row = ROWS.indexOf(rowName)
        if (row == -1 || row >= this.size) {
            throw new Error(`row number is invalid`)
        }
        return this.grid[row].join("")
    }

    getColAsString(col: number): string {
        if (col < 0 || col > this.size) {
            throw new Error("col has to be between 0 and 2")
        }
        const colVals = []
        for (let i = 0; i < this.size; i++) {
            colVals.push(this.grid[i][col])
        }

        return colVals.join("")
    }

    getDiagAsString(diagNo: number): string {
        const diagVals = []
        if (diagNo == 0) {
            for (let i = 0; i < this.size; i++) {
                diagVals.push(this.grid[i][i])
            }

            return diagVals.join("")
        } else if (diagNo == 1) {

            for (let i = 0; i < this.size; i++) {
                diagVals.push(this.grid[i][this.size - 1 - i])
            }
            return diagVals.join("")
        } else {
            throw new Error("Invalid diagonal")
        }
    }


}