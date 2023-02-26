package ast;

public enum OpUn {
    MINUS {
        public String toString() {
            return "-";
        }
    },
    PLUS {
        public String toString() { return "+";}
    },
    NOT {
        public String toString() {
            return "!";
        }
    }
}
