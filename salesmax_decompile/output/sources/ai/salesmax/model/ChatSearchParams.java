package ai.salesmax.model;

import java.util.Arrays;
import p001o.h8g;
import p001o.id5;
import p001o.sq8;
import type.SearchableBooleanFilterInput;
import type.SearchableChatMessageFilterInput;
import type.SearchableIDFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public final class ChatSearchParams {
    public static final int $stable = 8;
    private Boolean hasAttachment;
    private Boolean isStarred;
    private Boolean messageFromMe;
    private Boolean messageFromOther;
    private String searchText;

    public ChatSearchParams() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ChatSearchParams copy$default(ChatSearchParams chatSearchParams, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = chatSearchParams.isStarred;
        }
        if ((i & 2) != 0) {
            bool2 = chatSearchParams.hasAttachment;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            bool3 = chatSearchParams.messageFromMe;
        }
        Boolean bool6 = bool3;
        if ((i & 8) != 0) {
            bool4 = chatSearchParams.messageFromOther;
        }
        Boolean bool7 = bool4;
        if ((i & 16) != 0) {
            str = chatSearchParams.searchText;
        }
        return chatSearchParams.copy(bool, bool5, bool6, bool7, str);
    }

    public static /* synthetic */ SearchableChatMessageFilterInput.Builder toSearchableChatFilterInput$default(ChatSearchParams chatSearchParams, SearchableChatMessageFilterInput.Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = null;
        }
        return chatSearchParams.toSearchableChatFilterInput(builder);
    }

    public static /* synthetic */ void toggle$default(ChatSearchParams chatSearchParams, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        if ((i & 8) != 0) {
            bool4 = null;
        }
        chatSearchParams.toggle(bool, bool2, bool3, bool4);
    }

    public final Boolean component1() {
        return this.isStarred;
    }

    public final Boolean component2() {
        return this.hasAttachment;
    }

    public final Boolean component3() {
        return this.messageFromMe;
    }

    public final Boolean component4() {
        return this.messageFromOther;
    }

    public final String component5() {
        return this.searchText;
    }

    public final ChatSearchParams copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str) {
        sq8.m48649h(str, "searchText");
        return new ChatSearchParams(bool, bool2, bool3, bool4, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSearchParams)) {
            return false;
        }
        ChatSearchParams chatSearchParams = (ChatSearchParams) obj;
        return sq8.m48644c(this.isStarred, chatSearchParams.isStarred) && sq8.m48644c(this.hasAttachment, chatSearchParams.hasAttachment) && sq8.m48644c(this.messageFromMe, chatSearchParams.messageFromMe) && sq8.m48644c(this.messageFromOther, chatSearchParams.messageFromOther) && sq8.m48644c(this.searchText, chatSearchParams.searchText);
    }

    public final Boolean getHasAttachment() {
        return this.hasAttachment;
    }

    public final Boolean getMessageFromMe() {
        return this.messageFromMe;
    }

    public final Boolean getMessageFromOther() {
        return this.messageFromOther;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public int hashCode() {
        Boolean bool = this.isStarred;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasAttachment;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.messageFromMe;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.messageFromOther;
        return ((iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31) + this.searchText.hashCode();
    }

    public final Boolean isStarred() {
        return this.isStarred;
    }

    public final void reset() {
        this.isStarred = null;
        this.hasAttachment = null;
        this.messageFromMe = null;
        this.messageFromOther = null;
    }

    public final void setHasAttachment(Boolean bool) {
        this.hasAttachment = bool;
    }

    public final void setMessageFromMe(Boolean bool) {
        this.messageFromMe = bool;
    }

    public final void setMessageFromOther(Boolean bool) {
        this.messageFromOther = bool;
    }

    public final void setSearchText(String str) {
        sq8.m48649h(str, "<set-?>");
        this.searchText = str;
    }

    public final void setStarred(Boolean bool) {
        this.isStarred = bool;
    }

    public final SearchableChatMessageFilterInput.Builder toSearchableChatFilterInput(SearchableChatMessageFilterInput.Builder builder) {
        if (builder == null) {
            builder = SearchableChatMessageFilterInput.builder();
            sq8.m48648g(builder, "builder(...)");
        }
        Boolean bool = this.isStarred;
        if (bool != null) {
            builder.isStarred(SearchableBooleanFilterInput.builder().eq(Boolean.valueOf(bool.booleanValue())).build());
        }
        Boolean bool2 = this.hasAttachment;
        if (bool2 != null) {
            builder.mediaObjectId(SearchableIDFilterInput.builder().exists(Boolean.valueOf(bool2.booleanValue())).build());
        }
        Boolean bool3 = this.messageFromMe;
        if (bool3 != null) {
            bool3.booleanValue();
            builder.isInbound(SearchableBooleanFilterInput.builder().eq(Boolean.FALSE).build());
        }
        Boolean bool4 = this.messageFromOther;
        if (bool4 != null) {
            bool4.booleanValue();
            builder.isInbound(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build());
        }
        String str = this.searchText;
        SearchableStringFilterInput.Builder builder2 = SearchableStringFilterInput.builder();
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("*%s*", Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str2, "format(...)");
        builder.text(builder2.wildcard(str2).build());
        return builder;
    }

    public String toString() {
        return "ChatSearchParams(isStarred=" + this.isStarred + ", hasAttachment=" + this.hasAttachment + ", messageFromMe=" + this.messageFromMe + ", messageFromOther=" + this.messageFromOther + ", searchText=" + this.searchText + ")";
    }

    public final void toggle(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (this.isStarred == null) {
            this.isStarred = bool;
        } else {
            this.isStarred = null;
        }
        if (this.hasAttachment == null) {
            this.hasAttachment = bool2;
        } else {
            this.hasAttachment = null;
        }
        if (this.messageFromMe == null) {
            this.messageFromMe = bool3;
        } else {
            this.messageFromMe = bool3;
        }
        if (this.messageFromOther == null) {
            this.messageFromOther = bool4;
        } else {
            this.messageFromOther = null;
        }
    }

    public ChatSearchParams(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str) {
        sq8.m48649h(str, "searchText");
        this.isStarred = bool;
        this.hasAttachment = bool2;
        this.messageFromMe = bool3;
        this.messageFromOther = bool4;
        this.searchText = str;
    }

    public /* synthetic */ ChatSearchParams(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) == 0 ? bool4 : null, (i & 16) != 0 ? "" : str);
    }
}
