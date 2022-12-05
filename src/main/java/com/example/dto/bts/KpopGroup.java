package com.example.dto.bts;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class KpopGroup {
    private final String name;
    private final Integer numberOfMembers;

    public KpopGroup(final String name, final Integer numberOfMembers) {
        this.name = isBlank(name) ? "annoymous" : name;
        this.numberOfMembers = numberOfMembers;
    }

//    public KpopGroup() {
//        this.name = "annoymous";
//        this.numberOfMembers = 0;
//    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfMembers() {
        return numberOfMembers;
    }
}
