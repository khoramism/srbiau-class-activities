public class Generic {
    public class Generic <first,second, third> {
        private first name; 
        private second studentId;
        private third dadName;
        
        public first getName() {
            return this.name;

        }
        public void setName(first name) {
            this.name = name;
        }
        public second getStudentId() {
            return this.studentId;
        }
        public void setStudentId(second studentId) {
            this.studentId = studentId;
        }
        public third getDadName() {
            return this.dadName;
        }
        public void setDadName(third dadName) {
            this.dadName = dadName;
        }
    }
}
