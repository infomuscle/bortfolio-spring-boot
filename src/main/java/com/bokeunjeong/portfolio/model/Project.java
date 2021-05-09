package com.bokeunjeong.portfolio.model;


import com.bokeunjeong.portfolio.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@Getter
@Setter
@Entity(name = "PROJECT")
public class Project extends BaseEntity {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CLIENT")
    private String client;

    @Embedded
    private StartYearMonth startYearMonth;

    @Embedded
    private EndYearMonth endYearMonth;

    @Column(name = "IMG")
    private String image;

    @Column(name = "URL")
    private String url;

    @Column(name = "DISPLAY")
    private Boolean display;

    @OneToMany(mappedBy = "project")
    private List<ProjectDetail> details;


    @Getter
    @Setter
    @Embeddable
    static class StartYearMonth {

        @Column(name = "START_YEAR")
        private Integer year;

        @Column(name = "START_MONTH")
        private Integer month;

        public String getMonth() {
            return String.format("%02d", this.month);
        }

    }

    @Getter
    @Setter
    @Embeddable
    static class EndYearMonth {

        @Column(name = "END_YEAR")
        private Integer year;

        @Column(name = "END_MONTH")
        private Integer month;

        public String getMonth() {
            return String.format("%02d", this.month);
        }

    }
}
