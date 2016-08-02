package com.penguin.padang.pasir.nyaripasar.model;

/**
 * Created by jowy on 6/19/16.
 */

public class User {


    private String id;

    private String name;

    private String email;

    private String image;

    private String lapakId;

    private String description;

    private String role;

    private String registeredDate;

    private Boolean login;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return The lapakId
     */
    public String getLapakId() {
        return lapakId;
    }

    /**
     * @param lapakId The lapak_id
     */
    public void setLapakId(String lapakId) {
        this.lapakId = lapakId;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role The role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return The registeredDate
     */
    public String getRegisteredDate() {
        return registeredDate;
    }

    /**
     * @param registeredDate The registered_date
     */
    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    /**
     *
     * @return
     * The isLogin
     */
    public Boolean getLogin() {
            return login;
    }

    /**
     *
     * @param login
     * The login
     */
    public void setLogin(Boolean login) {
        this.login = login;
    }
}
