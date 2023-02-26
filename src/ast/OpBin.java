package ast;

public enum OpBin {

    ADD {
        public String toString() {
            return "+";
        }
    },
    SUB {
        public String toString() {
            return "-";
        }
    },
    MUL {
        public String toString() {
            return "*";
        }
    },
    DIV {
        public String toString() {
            return "/";
        }
    },
    EQ{
        public String toString(){
            return "==";
        }
    },
    DIFF{
        public String toString(){
            return "!=";
        }
    },
    LT{
        public String toString() {
            return "<";
        }
    },
    GT{
        public String toString() {
            return ">";
        }
    },
    GE{
        public String toString() {
            return "<=";
        }
    },
    LE{
        public String toString() {
            return ">=";
        }
    },
    AND{
        public String toString() {
            return "&&";
        }
    },
    OR{
        public String toString() {
            return "||";
        }
    },
    MOD{
        @Override
        public String toString() {
            return "%";
        }
    },
    POW{
        @Override
        public String toString() {
            return "^";
        }
    };

}
