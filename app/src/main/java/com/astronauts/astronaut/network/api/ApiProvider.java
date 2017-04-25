package com.astronauts.astronaut.network.api;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiProvider {

    @POST("comments/add/{linkId}/{upperCommentId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> commentAdd(@Path("linkId") String linkId, @Path("upperCommentId") String upperCommentId,
                                @Path("userkey") String userkey, @Path("appkey") String appkey,
                                @Field("body") String content, @Field("embed") String embedUrl);

    @POST("comments/plus/{linkId}/{commentId}/userkey/{userKey}/appkey/{appkey}/")
    Call<JSONObject> commentPlus(@Path("linkId") String linkId, @Path("commentId") String commentId,
                                 @Path("userkey") String userkey, @Path("appkey") String appkey);

    @POST("comments/minus/{linkId}/{commentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> commentMinus(@Path("linkId") String linkId, @Path("commentId") String commentId,
                                  @Path("userkey") String userkey, @Path("appkey") String appkey);

    @POST("comments/edit/{commentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> commentEdit(@Path("commentId") String commentId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey, @Field("body") String content);

    @POST("comments/delete/{commentId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> commentDelete(@Path("commentId") String commentId, @Path("userkey") String userkey,
                                   @Path("appkey") String appkey);

    @POST("link/index/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkIndex(@Path("linkId") String linkId, @Path("userkey") String userkey,
                               @Path("appkey") String appkey);

    @POST("link/dig/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkDig(@Path("linkId") String linkId, @Path("userkey") String userkey,
                             @Path("appkey") String appkey);

    @POST("link/cancel/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkCancel(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                @Path("appkey") String appkey);

    @POST("link/bury/{linkId}/{reasonId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkBury(@Path("linkId") String linkId, @Path("reasonId") String reasonId,
                              @Path("userkey") String userkey, @Path("appkey") String appkey);

    @POST("link/comments/{linkId}/appkey/{appkey}/")
    Call<JSONObject> linkComments(@Path("linkId") String linkId, @Path("appkey") String appkey);

    @POST("link/reports/{linkId}/appkey/{appkey}/")
    Call<JSONObject> linkReports(@Path("linkId") String linkId, @Path("appkey") String appkey);

    @POST("link/digs/{linkId}//appkey/{appkey}/")
    Call<JSONObject> linkDigs(@Path("linkId") String linkId, @Path("appkey") String appkey);

    @POST("link/related/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkRelated(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey);

    @POST("link/buryreasons//appkey/{appkey}/")
    Call<JSONObject> linkBuryReasons(@Path("appkey") String appkey);

    @POST("link/observe/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkObserve(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                 @Path("appkey") String appkey);

    @POST("link/favorite/{linkId}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> linkFavorite(@Path("linkId") String linkId, @Path("userkey") String userkey,
                                  @Path("appkey") String appkey);

    @POST("links/promoted/appkey/{appkey}/page/{page}/sort/{sort}")
    Call<JSONObject> linksPromoted(@Path("appkey") String appkey, @Path("page") String page,
                                   @Path("sort") String sort);

    @POST("links/upcoming/appkey/{appkey}/page/{page}/sort/{sort}")
    Call<JSONObject> linksUpcoming(@Path("appkey") String appkey, @Path("page") String page,
                                   @Path("sort") String sort);

    @POST("popular/promoted/appkey/{appkey}/")
    Call<JSONObject> popularPromoted(@Path("appkey") String appkey);

    @POST("popular/upcoming/appkey/{appkey}/")
    Call<JSONObject> popularUpcoming(@Path("appkey") String appkey);

    @POST("profile/index/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileIndex(@Path("userName") String userName, @Path("appkey") String appkey,
                                  @Path("page") String page);

    @POST("profile/added/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileAdded(@Path("userName") String userName, @Path("appkey") String appkey,
                                  @Path("page") String page);

    @POST("profile/published/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profilePublished(@Path("userName") String userName, @Path("appkey") String appkey,
                                      @Path("page") String page);

    @POST("profile/commented/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileCommented(@Path("userName") String userName, @Path("appkey") String appkey,
                                      @Path("page") String page);

    @POST("profile/comments/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileComments(@Path("userName") String userName, @Path("appkey") String appkey,
                                     @Path("page") String page);

    @POST("profile/digged/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileDigged(@Path("userName") String userName, @Path("appkey") String appkey,
                                   @Path("page") String page);

    @POST("profile/Buried/{userName}/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileBurried(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey, @Path("page") String page);

    @POST("profile/observe/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileObserve(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey);

    @POST("profile/unobserve/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileUnobserve(@Path("userName") String userName, @Path("userkey") String userkey,
                                      @Path("appkey") String appkey);

    @POST("profile/block/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileBlock(@Path("userName") String userName, @Path("userkey") String userkey,
                                  @Path("appkey") String appkey);

    @POST("profile/unblock/{userName}/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> profileUnblock(@Path("userName") String userName, @Path("userkey") String userkey,
                                    @Path("appkey") String appkey);

    @POST("profile/followers/{userName}/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileFollowers(@Path("userName") String userName, @Path("userkey") String userkey,
                                      @Path("appkey") String appkey, @Path("page") String page);

    @POST("profile/followed/{userName}/userkey/{userkey}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileFollowed(@Path("userName") String userName, @Path("userkey") String userkey,
                                     @Path("appkey") String appkey, @Path("page") String page);

    @POST("profile/entries/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileEntries(@Path("userName") String userName, @Path("appkey") String appkey,
                                    @Path("page") String page);

    @POST("profile/entriescomments/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileEntriesComments(@Path("userName") String userName, @Path("appkey") String appkey,
                                            @Path("page") String page);

    @POST("profile/related/{userName}/appkey/{appkey}/page/{page}/")
    Call<JSONObject> profileRelated(@Path("userName") String userName, @Path("appkey") String appkey,
                                    @Path("page") String page);

    @POST("search/index/appkey/{appkey}/page/{page}/")
    Call<JSONObject> searchIndex(@Path("appkey") String appkey, @Path("page") String page,
                                 @Field("q") String query);

    @POST("search/links/appkey/{appkey}/page/{page}/")
    Call<JSONObject> searchLinks(@Path("appkey") String appkey, @Path("page") String page,
                                 @Field("q") String query, @Field("what") String what,
                                 @Field("sort") String sort, @Field("when") String when,
                                 @Field("form") String dateFrom, @Field("to") String dateTo,
                                 @Field("votes") String votes);

    @POST("search/entries/appkey/{appkey}/page/{page}/")
    Call<JSONObject> searchEntries(@Path("appkey") String appkey, @Path("page") String page,
                                   @Field("q") String query);

    @POST("search/profiles/appkey/{appkey}/")
    Call<JSONObject> searchProfiles(@Path("appkey") String appkey, @Field("q") String query);

    @POST("user/login/appkey/{appkey}/")
    Call<JSONObject> userLogin(@Path("appkey") String appkey, @Field("login") String login,
                               @Field("password") String password);

    @POST("user/favorites/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> userFavorites(@Path("userkey") String userkey, @Path("appkey") String appkey);

    @POST("user/observed/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> userObserved(@Path("userkey") String userkey, @Path("appkey") String appkey);

    @POST("user/tags/userkey/{userkey}/appkey/{appkey}/")
    Call<JSONObject> userTags(@Path("userkey") String userkey, @Path("appkey") String appkey);

    @POST("top/index/{year}/appkey/{appkey}/")
    Call<JSONObject> topIndex(@Path("year") String year, @Path("month") String month,
                             @Path("appkey") String appkey, @Field("page") String page);

    @POST("top/date/{year}/{month}/appkey/{appkey}/")
    Call<JSONObject> topDate(@Path("year") String year, @Path("appkey") String appkey);

    @POST("top/hits/appkey/{appkey}/")
    Call<JSONObject> topHits(@Path("appkey") String appkey);

}
