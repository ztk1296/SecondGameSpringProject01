package com.example.FirstGameSpringProject.hedge.model;

public class TraderDTO {

    @Entity
    public class Trader {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String email;
        private String name;
        private double balance;

        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Trader {

        }
        @PrePersist
        public void onCreate() {
            createdAt = LocalDateTime.now();
            updatedAt = LocalDateTime.now();
        }

        @PreUpdate
        public void onUpdate() {
            updatedAt = LocalDateTime.now();
        }

        // getters and setters
    }
}
