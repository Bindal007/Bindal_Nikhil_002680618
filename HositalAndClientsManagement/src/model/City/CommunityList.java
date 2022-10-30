/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.City;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class CommunityList {
    private ArrayList<Community> communityList;

    public CommunityList() {
        this.communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addNewCommunity() {
        Community community = new Community();
        communityList.add(community);
        return community;
    }
    
    public void deleteCommunity(Community comm) {
        communityList.remove(comm);
    }
}
