package org.gitlab4j.api.models;

import org.gitlab4j.api.utils.JacksonJson;

public class Package {

    private Integer id;
    private String name;
    private String version;
    private PackageType packageType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}