class InvalidBoxNameError extends Error {
    message = 'Invalid box identifier';
}

export class Board {
    grid: Array<Array<string>> = [
        ["_", "_", "_"],
        ["_", "_", "_"],
        ["_", "_", "_"]
    ]

    printBoard() {
        console.log(`
        ${this.grid[0][0]}  ${this.grid[0][1]}  ${this.grid[0][2]}
        ${this.grid[1][0]}  ${this.grid[1][1]}  ${this.grid[1][2]}
        ${this.grid[2][0]}  ${this.grid[2][1]}  ${this.grid[2][2]}
        `)
    }

    markBoard(box: string, character: string): boolean {
        // box: A1 or B2 like that
        if (box.length != 2) {
            throw new InvalidBoxNameError()
        }
        const row = ["A", "B", "C"].indexOf(box.charAt(0))
        const col = Number(box.charAt(1)) - 1

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            throw new InvalidBoxNameError()
        }

        if (this.grid[row][col] != "_") {
            return false
        }

        this.grid[row][col] = character
        return true
    }

    getRowAsString(rowName: string): string {
        if (["A", "B", "C"].indexOf(rowName) == -1) {
            throw new Error("row has to be A, B or C")
        }
        const row = ["A", "B", "C"].indexOf(rowName)
        return this.grid[row].join("")
    }

    getColAsString(col: number): string {
        if (col < 0 || col > 2) {
            throw new Error("col has to be between 0 and 2")
        }
        return [this.grid[0][col], this.grid[1][col], this.grid[2][col]].join("")
    }

    getDiagAsString(diagNo: number): string {
        if (diagNo == 0) {
            return [this.grid[0][0], this.grid[1][1], this.grid[2][2]].join("")
        } else if (diagNo == 1) {
            return [this.grid[0][2], this.grid[1][1], this.grid[2][0]].join("")
        } else {
            throw new Error("Invalid diagonal")
        }
    }


}