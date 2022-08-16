package com.techelevator.dao;

import com.techelevator.model.Issue;
import com.techelevator.model.IssueDetailsDTO;
import com.techelevator.model.IssueOverviewDTO;

import java.security.Principal;
import java.util.List;

public interface IssueDao {
    List<IssueOverviewDTO> getAllIssues(Principal principal);
    List<IssueOverviewDTO> getIssuesByUser(int userId);
    List<IssueOverviewDTO> getIssuesByTag(int tagId);

    IssueDetailsDTO getIssueByIssueId(int issueId, Principal principal);

    IssueDetailsDTO createIssue(Issue issue);

    void deleteIssueByName(String name);
    void deleteIssueById(int issueId);

    void updateIssueByName(Issue updatedIssue);
    void updateIssueById(Issue updatedIssue);



}
