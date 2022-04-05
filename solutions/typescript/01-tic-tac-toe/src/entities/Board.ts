export class Board {
    grid: Array<Array<String>>

    constructor() {
        this.grid = [
            ['_', '_', '_'],
            ['_', '_', '_'],
            ['_', '_', '_']
        ]
    }

    public mark(row: number, col: number, symbol: String): void {
        if (this.grid[row][col] != '_'){
            throw new Error('This box is already marked')
        }
        this.grid[row][col] = symbol
    }

    public printBoard() {
        const g = this.grid
        console.log(`
            ${g[0][0]} ${g[0][1]} ${g[0][2]} 
            ${g[1][0]} ${g[1][1]} ${g[1][2]}
            ${g[2][0]} ${g[2][1]} ${g[2][2]}
            `)
    }

    public getRow(row: number): String {
        return this.grid[row].join('')
    }

    public getColumn(col: number): String {
        return this.grid.map(row => row[col]).join('')
    }

}