public enum Days {
    MONDAY("1 : Дуйшомбу") {
        @Override
        public void lessonsShedule() {
            System.out.println("Java жаны тема сабагы");
        }
    },
    TUESDAY("2 : Шейшемби"){
        @Override
        public void lessonsShedule() {
            System.out.println("Техникалык английский жана Java-практикалык сабагы");
        }
    },
    WEDNESDAY("3 : Шаршемби"){
    @Override
    public void lessonsShedule() {
        System.out.println("Java жаны тема сабагы");
    }
    },
    THURSDAY("4 : Бейшемби"){
            @Override
            public void lessonsShedule() {
            System.out.println("Java-практикалык сабагы");
        }
    },

    FRIDAY("5 : Жума"){
        @Override
        public void lessonsShedule() {
            System.out.println("Java жаны тема сабагы");
        }
    },
    SATURDAY("6 : Ишемби"){
        @Override
        public void lessonsShedule() {
            System.out.println("Java-практикалык сабагы");
        }
    },
    SUNDAY("7 : Жекшемби"){
        @Override
        public void lessonsShedule() {
            System.out.println("Java жаны тема сабагы");
        }
    };

    Days(String kyrgyzName) {
        this.kyrgyzName = kyrgyzName;
    }

    private String kyrgyzName;

    @Override
    public String toString() {
        return kyrgyzName;
    }
    public abstract void lessonsShedule ();
}

