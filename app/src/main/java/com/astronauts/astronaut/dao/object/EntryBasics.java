package com.astronauts.astronaut.dao.object;

import java.net.URI;
import java.util.Date;
import java.util.List;

/**
 * Created by end on 04.05.17.
 */

public interface EntryBasics {
    public int getId();

    public void setId(int id);

    public String getAuthor();

    public void setAuthor(String author);

    public Avatar getAuthorAvatar();

    public void setAuthorAvatar(Avatar authorAvatar);

    public URI getAuthorGroup();

    public void setAuthorGroup(URI authorGroup);

    public Date getDate();

    public void setDate(Date date);

    public String getBody();

    public void setBody(String body);

    public int getVoteCount();

    public void setVoteCount(int voteCount);

    public int getUserVote();

    public void setUserVote(int userVote);

    public List<Dig> getVoters();

    public void setVoters(List<Dig> voters);

    public Embed getEmbed();

    public void setEmbed(Embed embed);

    public Entry getEntry();

    public void setEntry(Entry entry);
}
