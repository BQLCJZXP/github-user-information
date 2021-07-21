
package com.example.github_user_information.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "login",
    "id",
    "node_id",
    "avatar_url",
    "gravatar_id",
    "url",
    "html_url",
    "followers_url",
    "following_url",
    "gists_url",
    "starred_url",
    "subscriptions_url",
    "organizations_url",
    "repos_url",
    "events_url",
    "received_events_url",
    "type",
    "site_admin",
    "name",
    "company",
    "blog",
    "location",
    "email",
    "hireable",
    "bio",
    "twitter_username",
    "public_repos",
    "public_gists",
    "followers",
    "following",
    "created_at",
    "updated_at"
})
@Generated("jsonschema2pojo")
public class GitHubUserDTO implements Serializable
{

    @JsonProperty("login")
    private String login;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("site_admin")
    private Boolean siteAdmin;
    @JsonProperty("name")
    private String name;
    @JsonProperty("company")
    private String company;
    @JsonProperty("blog")
    private String blog;
    @JsonProperty("location")
    private String location;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("hireable")
    private Object hireable;
    @JsonProperty("bio")
    private Object bio;
    @JsonProperty("twitter_username")
    private Object twitterUsername;
    @JsonProperty("public_repos")
    private Long publicRepos;
    @JsonProperty("public_gists")
    private Long publicGists;
    @JsonProperty("followers")
    private Long followers;
    @JsonProperty("following")
    private Long following;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    private final static long serialVersionUID = 870308233159540019L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitHubUserDTO() {
    }

    /**
     * 
     * @param receivedEventsUrl
     * @param siteAdmin
     * @param followingUrl
     * @param subscriptionsUrl
     * @param bio
     * @param login
     * @param type
     * @param blog
     * @param createdAt
     * @param followersUrl
     * @param company
     * @param id
     * @param email
     * @param updatedAt
     * @param gistsUrl
     * @param hireable
     * @param avatarUrl
     * @param organizationsUrl
     * @param reposUrl
     * @param htmlUrl
     * @param url
     * @param starredUrl
     * @param publicGists
     * @param twitterUsername
     * @param gravatarId
     * @param followers
     * @param following
     * @param name
     * @param publicRepos
     * @param location
     * @param eventsUrl
     * @param nodeId
     */
    public GitHubUserDTO(String login, Long id, String nodeId, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin, String name, String company, String blog, String location, Object email, Object hireable, Object bio, Object twitterUsername, Long publicRepos, Long publicGists, Long followers, Long following, String createdAt, String updatedAt) {
        super();
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.gravatarId = gravatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.twitterUsername = twitterUsername;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    public GitHubUserDTO withLogin(String login) {
        this.login = login;
        return this;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public GitHubUserDTO withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GitHubUserDTO withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public GitHubUserDTO withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public GitHubUserDTO withGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public GitHubUserDTO withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GitHubUserDTO withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    @JsonProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public GitHubUserDTO withFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public GitHubUserDTO withFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public GitHubUserDTO withGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public GitHubUserDTO withStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    @JsonProperty("subscriptions_url")
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public GitHubUserDTO withSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    @JsonProperty("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public GitHubUserDTO withOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    @JsonProperty("repos_url")
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public GitHubUserDTO withReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public GitHubUserDTO withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    @JsonProperty("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public GitHubUserDTO withReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public GitHubUserDTO withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    @JsonProperty("site_admin")
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public GitHubUserDTO withSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GitHubUserDTO withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public GitHubUserDTO withCompany(String company) {
        this.company = company;
        return this;
    }

    @JsonProperty("blog")
    public String getBlog() {
        return blog;
    }

    @JsonProperty("blog")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    public GitHubUserDTO withBlog(String blog) {
        this.blog = blog;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public GitHubUserDTO withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    public GitHubUserDTO withEmail(Object email) {
        this.email = email;
        return this;
    }

    @JsonProperty("hireable")
    public Object getHireable() {
        return hireable;
    }

    @JsonProperty("hireable")
    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public GitHubUserDTO withHireable(Object hireable) {
        this.hireable = hireable;
        return this;
    }

    @JsonProperty("bio")
    public Object getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(Object bio) {
        this.bio = bio;
    }

    public GitHubUserDTO withBio(Object bio) {
        this.bio = bio;
        return this;
    }

    @JsonProperty("twitter_username")
    public Object getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitter_username")
    public void setTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public GitHubUserDTO withTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    @JsonProperty("public_repos")
    public Long getPublicRepos() {
        return publicRepos;
    }

    @JsonProperty("public_repos")
    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public GitHubUserDTO withPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    @JsonProperty("public_gists")
    public Long getPublicGists() {
        return publicGists;
    }

    @JsonProperty("public_gists")
    public void setPublicGists(Long publicGists) {
        this.publicGists = publicGists;
    }

    public GitHubUserDTO withPublicGists(Long publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    @JsonProperty("followers")
    public Long getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public GitHubUserDTO withFollowers(Long followers) {
        this.followers = followers;
        return this;
    }

    @JsonProperty("following")
    public Long getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Long following) {
        this.following = following;
    }

    public GitHubUserDTO withFollowing(Long following) {
        this.following = following;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GitHubUserDTO withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GitHubUserDTO withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GitHubUserDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("gravatarId");
        sb.append('=');
        sb.append(((this.gravatarId == null)?"<null>":this.gravatarId));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("followersUrl");
        sb.append('=');
        sb.append(((this.followersUrl == null)?"<null>":this.followersUrl));
        sb.append(',');
        sb.append("followingUrl");
        sb.append('=');
        sb.append(((this.followingUrl == null)?"<null>":this.followingUrl));
        sb.append(',');
        sb.append("gistsUrl");
        sb.append('=');
        sb.append(((this.gistsUrl == null)?"<null>":this.gistsUrl));
        sb.append(',');
        sb.append("starredUrl");
        sb.append('=');
        sb.append(((this.starredUrl == null)?"<null>":this.starredUrl));
        sb.append(',');
        sb.append("subscriptionsUrl");
        sb.append('=');
        sb.append(((this.subscriptionsUrl == null)?"<null>":this.subscriptionsUrl));
        sb.append(',');
        sb.append("organizationsUrl");
        sb.append('=');
        sb.append(((this.organizationsUrl == null)?"<null>":this.organizationsUrl));
        sb.append(',');
        sb.append("reposUrl");
        sb.append('=');
        sb.append(((this.reposUrl == null)?"<null>":this.reposUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("receivedEventsUrl");
        sb.append('=');
        sb.append(((this.receivedEventsUrl == null)?"<null>":this.receivedEventsUrl));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("siteAdmin");
        sb.append('=');
        sb.append(((this.siteAdmin == null)?"<null>":this.siteAdmin));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        sb.append("blog");
        sb.append('=');
        sb.append(((this.blog == null)?"<null>":this.blog));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("hireable");
        sb.append('=');
        sb.append(((this.hireable == null)?"<null>":this.hireable));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("twitterUsername");
        sb.append('=');
        sb.append(((this.twitterUsername == null)?"<null>":this.twitterUsername));
        sb.append(',');
        sb.append("publicRepos");
        sb.append('=');
        sb.append(((this.publicRepos == null)?"<null>":this.publicRepos));
        sb.append(',');
        sb.append("publicGists");
        sb.append('=');
        sb.append(((this.publicGists == null)?"<null>":this.publicGists));
        sb.append(',');
        sb.append("followers");
        sb.append('=');
        sb.append(((this.followers == null)?"<null>":this.followers));
        sb.append(',');
        sb.append("following");
        sb.append('=');
        sb.append(((this.following == null)?"<null>":this.following));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.receivedEventsUrl == null)? 0 :this.receivedEventsUrl.hashCode()));
        result = ((result* 31)+((this.siteAdmin == null)? 0 :this.siteAdmin.hashCode()));
        result = ((result* 31)+((this.followingUrl == null)? 0 :this.followingUrl.hashCode()));
        result = ((result* 31)+((this.subscriptionsUrl == null)? 0 :this.subscriptionsUrl.hashCode()));
        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
        result = ((result* 31)+((this.login == null)? 0 :this.login.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.blog == null)? 0 :this.blog.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.followersUrl == null)? 0 :this.followersUrl.hashCode()));
        result = ((result* 31)+((this.company == null)? 0 :this.company.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.gistsUrl == null)? 0 :this.gistsUrl.hashCode()));
        result = ((result* 31)+((this.hireable == null)? 0 :this.hireable.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.organizationsUrl == null)? 0 :this.organizationsUrl.hashCode()));
        result = ((result* 31)+((this.reposUrl == null)? 0 :this.reposUrl.hashCode()));
        result = ((result* 31)+((this.htmlUrl == null)? 0 :this.htmlUrl.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.starredUrl == null)? 0 :this.starredUrl.hashCode()));
        result = ((result* 31)+((this.publicGists == null)? 0 :this.publicGists.hashCode()));
        result = ((result* 31)+((this.twitterUsername == null)? 0 :this.twitterUsername.hashCode()));
        result = ((result* 31)+((this.gravatarId == null)? 0 :this.gravatarId.hashCode()));
        result = ((result* 31)+((this.followers == null)? 0 :this.followers.hashCode()));
        result = ((result* 31)+((this.following == null)? 0 :this.following.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publicRepos == null)? 0 :this.publicRepos.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.eventsUrl == null)? 0 :this.eventsUrl.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubUserDTO) == false) {
            return false;
        }
        GitHubUserDTO rhs = ((GitHubUserDTO) other);
        return (((((((((((((((((((((((((((((((((this.receivedEventsUrl == rhs.receivedEventsUrl)||((this.receivedEventsUrl!= null)&&this.receivedEventsUrl.equals(rhs.receivedEventsUrl)))&&((this.siteAdmin == rhs.siteAdmin)||((this.siteAdmin!= null)&&this.siteAdmin.equals(rhs.siteAdmin))))&&((this.followingUrl == rhs.followingUrl)||((this.followingUrl!= null)&&this.followingUrl.equals(rhs.followingUrl))))&&((this.subscriptionsUrl == rhs.subscriptionsUrl)||((this.subscriptionsUrl!= null)&&this.subscriptionsUrl.equals(rhs.subscriptionsUrl))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.login == rhs.login)||((this.login!= null)&&this.login.equals(rhs.login))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.blog == rhs.blog)||((this.blog!= null)&&this.blog.equals(rhs.blog))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.followersUrl == rhs.followersUrl)||((this.followersUrl!= null)&&this.followersUrl.equals(rhs.followersUrl))))&&((this.company == rhs.company)||((this.company!= null)&&this.company.equals(rhs.company))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.gistsUrl == rhs.gistsUrl)||((this.gistsUrl!= null)&&this.gistsUrl.equals(rhs.gistsUrl))))&&((this.hireable == rhs.hireable)||((this.hireable!= null)&&this.hireable.equals(rhs.hireable))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.organizationsUrl == rhs.organizationsUrl)||((this.organizationsUrl!= null)&&this.organizationsUrl.equals(rhs.organizationsUrl))))&&((this.reposUrl == rhs.reposUrl)||((this.reposUrl!= null)&&this.reposUrl.equals(rhs.reposUrl))))&&((this.htmlUrl == rhs.htmlUrl)||((this.htmlUrl!= null)&&this.htmlUrl.equals(rhs.htmlUrl))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.starredUrl == rhs.starredUrl)||((this.starredUrl!= null)&&this.starredUrl.equals(rhs.starredUrl))))&&((this.publicGists == rhs.publicGists)||((this.publicGists!= null)&&this.publicGists.equals(rhs.publicGists))))&&((this.twitterUsername == rhs.twitterUsername)||((this.twitterUsername!= null)&&this.twitterUsername.equals(rhs.twitterUsername))))&&((this.gravatarId == rhs.gravatarId)||((this.gravatarId!= null)&&this.gravatarId.equals(rhs.gravatarId))))&&((this.followers == rhs.followers)||((this.followers!= null)&&this.followers.equals(rhs.followers))))&&((this.following == rhs.following)||((this.following!= null)&&this.following.equals(rhs.following))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publicRepos == rhs.publicRepos)||((this.publicRepos!= null)&&this.publicRepos.equals(rhs.publicRepos))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.eventsUrl == rhs.eventsUrl)||((this.eventsUrl!= null)&&this.eventsUrl.equals(rhs.eventsUrl))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))));
    }

}
