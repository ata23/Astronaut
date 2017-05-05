package com.astronauts.astronaut.dao.object;

import java.net.URI;
import java.util.Date;
import java.util.List;

/**
 * Created by end on 04.05.17.
 */

public interface EntryBasics {
    int getId();

    void setId(int id);

    String getAuthor();

    void setAuthor(String author);

    Avatar getAuthorAvatar();

    void setAuthorAvatar(Avatar authorAvatar);

    URI getAuthorGroup();

    void setAuthorGroup(URI authorGroup);

    Date getDate();

    void setDate(Date date);

    String getBody();

    void setBody(String body);

    int getVoteCount();

    void setVoteCount(int voteCount);

    int getUserVote();

    void setUserVote(int userVote);

    List<Dig> getVoters();

    void setVoters(List<Dig> voters);

    Embed getEmbed();

    void setEmbed(Embed embed);

    Entry getEntry();

    void setEntry(Entry entry);
}
