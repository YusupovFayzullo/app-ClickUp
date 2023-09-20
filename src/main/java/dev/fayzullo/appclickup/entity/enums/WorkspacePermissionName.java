package dev.fayzullo.appclickup.entity.enums;



public enum WorkspacePermissionName {

    CAN_ADD_OR_REMOVE_MEMBER("Add/Remove Members","Gives user permission to add or remove members to the workspace"),
    CAN_MANAGE_STATUS("Edit statuses","Gives permissions");

    public String name;
    public String description;


    WorkspacePermissionName(String name,String description){
        this.name=name;
        this.description=description;
    }

}
