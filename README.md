# Description
PlayerTitle is a plugin designed for WHU Minecraft University.You can use this plugin to register your course name and distinguish you from others.
# Command
PlayerTitle only suppose basic command for our special aim.
You can use command belowing to execute special aim.

    Common Usage:
    /pt about ---Get this plugin's basic information.
    /pt list  ---Get title which you can use.
    /pt setcourse [coursename]  ---Set Your coursename to get the special title.
    /pt getcourseid  ---Get courseid list
    /pt setdisplay [title]  ---Make the targeted title visiable.
    /pt bandisplay [title]   ---Make the targeted title unvisiable.
    Administrator Usage:
    /ptadmin add [username] [title]  ---Set the title for a user.
    /ptadmin remove [username] [title]   ---Remove the title for a user.
    /ptadmin list [username]  ---Get the title list of a user.
    /ptadmin setdisplay [username] [title]  ---Make the targeted title visiable.
    /ptadmin bandisplay [username] [title]   ---Make the targeted title unvisiable.
    /ptadmin changecourse [username] [targetcourseid]  ---Change a user's course title.

# Notice
1.You should know that you cannot change your courseid after you set your own courseid.If you need to change your course title , please connect your server manager.  
2.Bandisplay command will not remove the title from the player's title lists.

# Config
You can find such files in the plugin's config dir.  
1.courseid.yml:  
You should set the Courseid in such a format.

        Courseid:  
            1: Doctor  
            2. Computer   
2.admin.yml：  
You should set the Admin in such a format.

        Administrator:  
            epicmo  
            Test_User  
3.Dir-Players:  
Every Player's data will be saved in file system.You can also change them if you know how to do it.

        EpicMo:  
            Courseid: 1  
            Title:   
                Has:  
                    Admin  
                    TestAdmin  
                Display:  
                    Admin  

4.Dir-Title:  
Every Title's data will be saved in file system.You can also change them if you know how to do it.

        Admin:Admin  
        TestAdmin:TestAdminTitleContent  


# CopyRight
This project has the GPLV3 license.