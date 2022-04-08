export class Player {
    name: string;
    character: string;
    static Builder = class PlayerBuilder {
        private name!: string;
        private character!: string;


        setName(value: string): PlayerBuilder {
            this.name = value;
            return this;
        }

        setCharacter(value: string): PlayerBuilder {
            if (value == "_") {
                throw new Error("Underscore '_' is not a valid player character")
            }
            this.character = value;
            return this;
        }

        build(): Player {
            return new Player(this.name, this.character)
        }
    }


    private constructor(name: string, character: string) {
        this.name = name;
        this.character = character;
    }
}

