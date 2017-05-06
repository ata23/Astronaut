package com.astronauts.astronaut.network.api;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiProvider {

    @POST("comments/add/{linkId}/{upperCommentId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> commentAdd(@Path("linkId") String linkId, @Path("upperCommentId") String upperCommentId,
                                @Path("userkey") String userkey, @Path("appkey") String appkey,
                                @Field("body") String content, @Field("embed") String embedUrl,
                                @Header("apisign") String sign);

    @POST("comments/plus/{linkId}/{commentId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> commentPlus(@Path("linkId") String linkId, @Path("commentId") String commentId,
                                 @Path("userkey") String userkey, @Path("appkey") String appkey,
                                 @Header("apisign") String sign);

    @POST("comments/minus/{linkId}/{commentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> commentMinus(@Path("linkId") String linkId, @Path("commentId") String commentId,
                                  @Path("userkey") String userkey, @Path("appkey") String appkey,
                                  @Header("apisign") String sign);

    @POST("comments/edit/{commentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> commentEdit(@Path("commentId") String commentId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey, @Field("body") String content,
                                 @Header("apisign") String sign);

    @POST("comments/delete/{commentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> commentDelete(@Path("commentId") String commentId, @Path("userkey") String userkey,
                                   @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/index/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkIndex(@Path("linkId") String linkId, @Path("userkey") String userkey,
                               @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/dig/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkDig(@Path("linkId") String linkId, @Path("userkey") String userkey,
                             @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/cancel/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkCancel(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/bury/{linkId}/{reasonId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkBury(@Path("linkId") String linkId, @Path("reasonId") String reasonId,
                              @Path("userkey") String userkey, @Path("appkey") String appkey,
                              @Header("apisign") String sign);

    @POST("link/comments/{linkId}/appkey/{appkey}/")
    Call<JSONObject> linkComments(@Path("linkId") String linkId, @Path("appkey") String appkey,
                                  @Header("apisign") String sign);

    @POST("link/reports/{linkId}/appkey/{appkey}/")
    Call<JSONObject> linkReports(@Path("linkId") String linkId, @Path("appkey") String appkey,
                                 @Header("apisign") String sign);

    @POST("link/digs/{linkId}//appkey/{appkey}/")
    Call<JSONObject> linkDigs(@Path("linkId") String linkId, @Path("appkey") String appkey,
                              @Header("apisign") String sign);

    @POST("link/related/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkRelated(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/buryreasons//appkey/{appkey}/")
    Call<JSONObject> linkBuryReasons(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/observe/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkObserve(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("link/favorite/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkFavorite(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                  @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("links/promoted/appkey/{appkey}/page/{page}/sort/{sort}")
    Call<JSONObject> linksPromoted(@Path("appkey") String appkey, @Path("page") String page,
                                   @Path("sort") String sort, @Header("apisign") String sign);

    @POST("links/upcoming/appkey/{appkey}/page/{page}/sort/{sort}")
    Call<JSONObject> linksUpcoming(@Path("appkey") String appkey, @Path("page") String page,
                                   @Path("sort") String sort, @Header("apisign") String sign);

    @POST("popular/promoted/appkey/{appkey}/")
    Call<JSONObject> popularPromoted(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("popular/upcoming/appkey/{appkey}/")
    Call<JSONObject> popularUpcoming(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("profile/index/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileIndex(@Path("userName") String userName, @Path("appkey") String appkey,
                                  @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/added/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileAdded(@Path("userName") String userName, @Path("appkey") String appkey,
                                  @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/published/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profilePublished(@Path("userName") String userName, @Path("appkey") String appkey,
                                      @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/commented/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileCommented(@Path("userName") String userName, @Path("appkey") String appkey,
                                      @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/comments/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileComments(@Path("userName") String userName, @Path("appkey") String appkey,
                                     @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/digged/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileDigged(@Path("userName") String userName, @Path("appkey") String appkey,
                                   @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/buried/{userName}/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileBurried(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey, @Path("page") String page,
                                    @Header("apisign") String sign);

    @POST("profile/observe/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileObserve(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("profile/unobserve/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileUnobserve(@Path("userName") String userName, @Path("userkey") String userkey,
                                      @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("profile/block/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileBlock(@Path("userName") String userName, @Path("userkey") String userkey,
                                  @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("profile/unblock/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileUnblock(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("profile/followers/{userName}/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileFollowers(@Path("userName") String userName, @Path("userkey") String userkey,
                                      @Path("appkey") String appkey, @Path("page") String page,
                                      @Header("apisign") String sign);

    @POST("profile/followed/{userName}/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileFollowed(@Path("userName") String userName, @Path("userkey") String userkey,
                                     @Path("appkey") String appkey, @Path("page") String page,
                                     @Header("apisign") String sign);

    @POST("profile/entries/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileEntries(@Path("userName") String userName, @Path("appkey") String appkey,
                                    @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/entriescomments/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileEntriesComments(@Path("userName") String userName, @Path("appkey") String appkey,
                                            @Path("page") String page, @Header("apisign") String sign);

    @POST("profile/related/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileRelated(@Path("userName") String userName, @Path("appkey") String appkey,
                                    @Path("page") String page, @Header("apisign") String sign);

    @POST("search/index/appkey/{appkey}/page/{page}/")
    Call<JSONObject> searchIndex(@Path("appkey") String appkey, @Path("page") String page,
                                 @Field("q") String query, @Header("apisign") String sign);

    @POST("search/links/appkey/{appkey}/page/{page}/")
    Call<JSONObject> searchLinks(@Path("appkey") String appkey, @Path("page") String page,
                                 @Field("q") String query, @Field("what") String what,
                                 @Field("sort") String sort, @Field("when") String when,
                                 @Field("form") String dateFrom, @Field("to") String dateTo,
                                 @Field("votes") String votes, @Header("apisign") String sign);

    @POST("search/entries/appkey/{appkey}/page/{page}/")
    Call<JSONObject> searchEntries(@Path("appkey") String appkey, @Path("page") String page,
                                   @Field("q") String query, @Header("apisign") String sign);

    @POST("search/profiles/appkey/{appkey}/")
    Call<JSONObject> searchProfiles(@Path("appkey") String appkey, @Field("q") String query,
                                    @Header("apisign") String sign);

    @POST("user/login/appkey/{appkey}/")
    Call<JSONObject> userLogin(@Path("appkey") String appkey, @Field("login") String login,
                               @Field("password") String password, @Header("apisign") String sign);

    @POST("user/favorites/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> userFavorites(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                   @Header("apisign") String sign);

    @POST("user/observed/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> userObserved(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                  @Header("apisign") String sign);

    @POST("user/tags/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> userTags(@Path("userkey") String userkey, @Path("appkey") String appkey,
                              @Header("apisign") String sign);

    @POST("top/index/{year}/appkey/{appkey}/")
    Call<JSONObject> topIndex(@Path("year") String year, @Path("month") String month,
                              @Path("appkey") String appkey, @Field("page") String page,
                              @Header("apisign") String sign);

    @POST("top/date/{year}/{month}/appkey/{appkey}/")
    Call<JSONObject> topDate(@Path("year") String year, @Path("appkey") String appkey,
                             @Header("apisign") String sign);

    @POST("top/hits/appkey/{appkey}/")
    Call<JSONObject> topHits(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("related/plus/{linkId}/{linkedId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> relatedPlus(@Path("linkId") String linkId, @Path("linkedId") String linkedId,
                                 @Path("userkey") String userkey, @Path("appkey") String appkey,
                                 @Header("apisign") String sign);

    @POST("related/minus/{linkId}/{linkedId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> relatedMinus(@Path("linkId") String linkId, @Path("linkedId") String linkedId,
                                  @Path("userkey") String userkey, @Path("appkey") String appkey,
                                  @Header("apisign") String sign);

    @POST("related/add/{linkId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> relatedAdd(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                @Path("appkey") String appkey, @Field("url") String url,
                                @Field("title") String title, @Field("plus18") String plus18,
                                @Header("apisign") String sign);

    @POST("mywykop/index/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> mywykopIndex(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                  @Path("page") String page, @Header("apisign") String sign);

    @POST("mywykop/tags/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> mywykopTags(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                 @Path("page") String page, @Header("apisign") String sign);

    @POST("mywykop/users/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> mywykopUsers(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                  @Path("page") String page, @Header("apisign") String sign);

    @POST("mywykop/notifications/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> mywykopNotifications(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                          @Path("page") String page, @Header("apisign") String sign);

    @POST("mywykop/notificationscount/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> mywykopNotificationsCount(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                               @Header("apisign") String sign);

    @POST("mywykop/hashtagsnotifications/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> mywykopHashTagsNotifications(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                                  @Path("page") String page, @Header("apisign") String sign);

    @POST("mywykop/hashtagsnotificationscount/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> mywykopHashTagsNotificationsCount(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                                       @Header("apisign") String sign);

    @POST("mywykop/readnotifications/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> mywykopReadNotifications(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                              @Header("apisign") String sign);

    @POST("mywykop/readhashtagsnotifications/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> mywykopReadHashTagsNotifications(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                                      @Header("apisign") String sign);

    @POST("mywykop/markasreadnotification/{notificationId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> mywykopMarkAsReadNotification(@Path("notificationId") String notificationId, @Path("userkey") String userkey,
                                                   @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("entries/comments/{entryId}/appkey/{appkey}/")
    Call<JSONObject> entriesIndex(@Path("entryId") String entryId, @Path("appkey") String appkey,
                                  @Header("apisign") String sign);

    //TODO Add FILE parameter in this request
    @POST("entries/add/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesAdd(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                @Field("body") String content, @Field("embed") String url,
                                @Header("apisign") String sign);

    @POST("entries/edit/{entryId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesEdit(@Path("entryId") String entryId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey, @Field("body") String content,
                                 @Header("apisign") String sign);

    @POST("entries/delete/{entryId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesDelete(@Path("entryId") String entryId, @Path("userkey") String userkey,
                                   @Path("appkey") String appkey, @Header("apisign") String sign);

    //TODO Add FILE parameter in this request
    @POST("entries/addcomment/{entryId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesAddComment(@Path("entryId") String entryId, @Path("userkey") String userkey,
                                       @Path("appkey") String appkey, @Field("body") String content,
                                       @Field("embed") String url, @Header("apisign") String sign);

    @POST("entries/editcomment/{entryId}/{entryCommentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesEditComment(@Path("entryId") String entryId, @Path("entryCommentId") String entryCommentId,
                                        @Path("userkey") String userkey, @Path("appkey") String appkey,
                                        @Field("body") String content, @Header("apisign") String sign);

    @POST("entries/deletecomment/{entryId}/{entryCommentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesDeleteComment(@Path("entryId") String entryId, @Path("entryCommentId") String entryCommentId,
                                          @Path("userkey") String userkey, @Path("appkey") String appkey,
                                          @Header("apisign") String sign);

    @POST("entries/vote/{type}/{entryId}/{entryCommentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesVote(@Path("type") String type, @Path("entryId") String entryId,
                                 @Path("entryCommentId") String entryCommentId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("entries/unvote/{type}/{entryId}/{entryCommentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesUnvote(@Path("type") String type, @Path("entryId") String entryId,
                                   @Path("entryCommentId") String entryCommentId, @Path("userkey") String userkey,
                                   @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("entries/favorite/{entryId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> entriesFavorite(@Path("entryId") String entryId, @Path("userkey") String userkey,
                                     @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("rank/index/{order}/appkey/{appkey}/")
    Call<JSONObject> rankIndex(@Path("order") String order, @Path("appkey") String appkey,
                               @Header("apisign") String sign);

    @POST("observatory/votes/appkey/{appkey}/")
    Call<JSONObject> observatoryVotes(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("observatory/comments/appkey/{appkey}/")
    Call<JSONObject> observatoryComments(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("observatory/entries/appkey/{appkey}/")
    Call<JSONObject> observatoryEntries(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("observatory/entriescomments/appkey/{appkey}/")
    Call<JSONObject> observatoryEntriesComments(@Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("favorites/index/{listId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> favoritesIndex(@Path("listId") String listId, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("favorites/comments/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> favoritesComments(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                       @Header("apisign") String sign);

    @POST("favorites/entries/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> favoritesEntries(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                      @Header("apisign") String sign);

    @POST("favorites/lists/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> favoritesLists(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                    @Header("apisign") String sign);

    @POST("stream/index/appkey/{appkey}/page/{page}/")
    Call<JSONObject> streamIndex(@Path("appkey") String appkey, @Path("page") String page,
                                 @Header("apisign") String sign);

    @POST("stream/hot/appkey/{appkey}/page/{page}/period/{period}/")
    Call<JSONObject> streamHot(@Path("appkey") String appkey, @Path("page") String page,
                                @Path("period") String period, @Header("apisign") String sign);

    @POST("tag/index/{tagName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> tagIndex(@Path("tagName") String tagName, @Path("appkey") String appkey,
                              @Path("page") String page, @Header("apisign") String sign);

    @POST("tag/links/{tagName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> tagLinks(@Path("tagName") String tagName, @Path("appkey") String appkey,
                              @Path("page") String page, @Header("apisign") String sign);

    @POST("tag/entries/{tagName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> tagEntries(@Path("tagName") String tagName, @Path("appkey") String appkey,
                              @Path("page") String page, @Header("apisign") String sign);

    @POST("tag/observe/{tagName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> tagObserve(@Path("tagName") String tagName, @Path("userkey") String userkey,
                                @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("tag/unobserve/{tagName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> tagUnobserve(@Path("tagName") String tagName, @Path("userkey") String userkey,
                                @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("tag/block/{tagName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> tagBlock(@Path("tagName") String tagName, @Path("userkey") String userkey,
                                  @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("tag/unblock/{tagName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> tagUnblock(@Path("tagName") String tagName, @Path("userkey") String userkey,
                                  @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("pm/conversationslist/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> pmConversationsList(@Path("userkey") String userkey, @Path("appkey") String appkey,
                                     @Header("apisign") String sign);

    @POST("pm/conversation/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> pmConversation(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey, @Header("apisign") String sign);

    //TODO Add FILE parameter in this request
    @POST("pm/sendmessage/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> pmSendMessage(@Path("userName") String userName, @Path("userkey") String userkey,
                                   @Path("appkey") String appkey, @Field("body") String content,
                                   @Field("embed") String url, @Header("apisign") String sign);

    @POST("pm/deleteconversation/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> pmDeleteConversation(@Path("userName") String userName, @Path("userkey") String userkey,
                                          @Path("appkey") String appkey, @Header("apisign") String sign);

    @POST("tags/index/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> tagsIndex(@Path("userkey") String userkey, @Path("appkey") String appkey,
                               @Header("apisign") String sign);

}
