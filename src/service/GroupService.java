package service;

import Groups.Group;

public interface GroupService {

    public Group [] addNewGroups ();
    public Group getGroup();
    String  updateGroup ();
    public Group [] getAllGroup();
    Group[] deletegroup();



}
