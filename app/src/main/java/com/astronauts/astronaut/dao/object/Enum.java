package com.astronauts.astronaut.dao.object;

/**
 * Created by end on 05.05.17.
 */

public class Enum {

    enum MessageStatus {unread, read}

    enum MessageDirection {sended, received}

    enum AvatarQuality {normal, medium, low}

    enum EmbedType {image, video}

    enum MyWykopType {link, entry}

    enum NotificationType {
        register,
        observe,
        unobserve,
        entryCommentDirected,
        entryDirected,
        entryTag,
        linkCommentDirected,
        linkPromoted,
        linkDirected,
        system,
        badge,
        supportAnswer,
        channelRequest,
        channelAccepted,
        channelRejected,
        pm
    }

}
