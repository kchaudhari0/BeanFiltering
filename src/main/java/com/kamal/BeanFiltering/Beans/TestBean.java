package com.kamal.BeanFiltering.Beans;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("BeanFilter")
public class TestBean {

    public String Bean1;

    public String Bean2;

    public String Bean3;

    public String getBean1() {
        return Bean1;
    }

    public void setBean1(String bean1) {
        Bean1 = bean1;
    }

    public String getBean2() {
        return Bean2;
    }

    public void setBean2(String bean2) {
        Bean2 = bean2;
    }

    public String getBean3() {
        return Bean3;
    }

    public void setBean3(String bean3) {
        Bean3 = bean3;
    }

    public TestBean(String bean1, String bean2, String bean3) {
        Bean1 = bean1;
        Bean2 = bean2;
        Bean3 = bean3;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "Bean1='" + Bean1 + '\'' +
                ", Bean2='" + Bean2 + '\'' +
                ", Bean3='" + Bean3 + '\'' +
                '}';
    }
}
