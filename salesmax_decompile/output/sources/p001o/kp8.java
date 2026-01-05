package p001o;

import com.amplifyframework.datastore.generated.model.ChatChannel;
import com.amplifyframework.datastore.generated.model.ChatParticipant;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.SearchableBooleanFilterInput;
import type.SearchableChatChannelFilterInput;
import type.SearchableChatMentionsFilterInput;
import type.SearchableChatParticipantFilterInput;
import type.SearchableIDFilterInput;
import type.SearchableIntFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public enum kp8 {
    ALL("All", new Supplier() { // from class: o.co8
        @Override // java.util.function.Supplier
        public final Object get() {
            return kp8.lambda$static$0();
        }
    }, new ggd() { // from class: o.gp8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$1((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.hp8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$2((ChatChannel) obj);
        }
    }),
    UNREAD("Unread", new Supplier() { // from class: o.ip8
        @Override // java.util.function.Supplier
        public final Object get() {
            return kp8.lambda$static$3();
        }
    }, new ggd() { // from class: o.jp8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$5((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.do8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$6((ChatChannel) obj);
        }
    }),
    DIRECT("Direct", new Supplier() { // from class: o.eo8
        @Override // java.util.function.Supplier
        public final Object get() {
            return kp8.lambda$static$7();
        }
    }, new ggd() { // from class: o.fo8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$8((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.go8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$9((ChatChannel) obj);
        }
    }),
    GROUP("Group", new Supplier() { // from class: o.ho8
        @Override // java.util.function.Supplier
        public final Object get() {
            return kp8.lambda$static$10();
        }
    }, new ggd() { // from class: o.no8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$11((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.yo8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$12((ChatChannel) obj);
        }
    }),
    STARRED("Starred", new Supplier() { // from class: o.dp8
        @Override // java.util.function.Supplier
        public final Object get() {
            return kp8.lambda$static$13();
        }
    }, new ggd() { // from class: o.ep8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$14((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.fp8
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return kp8.lambda$static$15((ChatChannel) obj);
        }
    });

    private Supplier<SearchableChatChannelFilterInput.Builder> chatChannelFilterInputBuilder;
    private ggd chatChannelSubscriptionFilter;
    private Supplier<SearchableChatMentionsFilterInput.Builder> chatMentionsInputBuilder;
    private ggd chatMentionsSubscriptionFilter;
    private Supplier<SearchableChatParticipantFilterInput.Builder> chatParticipantInputBuilder;
    private ggd chatParticipantSubscriptionFilter;
    private String optionType;

    kp8(String str, Supplier supplier, ggd ggdVar, Supplier supplier2, ggd ggdVar2) {
        this.optionType = str;
        this.chatParticipantInputBuilder = supplier;
        this.chatParticipantSubscriptionFilter = ggdVar;
        this.chatChannelFilterInputBuilder = supplier2;
        this.chatChannelSubscriptionFilter = ggdVar2;
        this.chatMentionsInputBuilder = null;
        this.chatMentionsSubscriptionFilter = null;
    }

    public static String[] chatChannelOptionTypes() {
        return (String[]) ((List) Arrays.stream(values()).filter(new Predicate() { // from class: o.uo8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return kp8.lambda$chatChannelOptionTypes$30((kp8) obj);
            }
        }).map(new Function() { // from class: o.vo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((kp8) obj).optionType;
            }
        }).collect(Collectors.toList())).toArray(new String[0]);
    }

    public static String[] chatParticipantOptionTypes() {
        return (String[]) ((List) Arrays.stream(values()).filter(new Predicate() { // from class: o.jo8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return kp8.lambda$chatParticipantOptionTypes$28((kp8) obj);
            }
        }).map(new Function() { // from class: o.ko8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((kp8) obj).optionType;
            }
        }).collect(Collectors.toList())).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$20(String str, SearchableChatChannelFilterInput.Builder builder) {
        return builder.accountId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$21(SearchableChatChannelFilterInput.Builder builder, String str) {
        return builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$22(String str, final SearchableChatChannelFilterInput.Builder builder) {
        return (SearchableChatChannelFilterInput.Builder) Optional.ofNullable(str).map(new Function() { // from class: o.lo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$21(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$23(SearchableChatChannelFilterInput.Builder builder, String str) {
        return builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$24(String str, final SearchableChatChannelFilterInput.Builder builder) {
        return (SearchableChatChannelFilterInput.Builder) Optional.ofNullable(str).map(new Function() { // from class: o.ap8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$23(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$25(SearchableChatChannelFilterInput.Builder builder, String str) {
        return builder.channelName(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str)).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$26(String str, final SearchableChatChannelFilterInput.Builder builder) {
        return (SearchableChatChannelFilterInput.Builder) Optional.ofNullable(str).map(new Function() { // from class: o.to8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$25(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$27(SearchableChatChannelFilterInput.Builder builder) {
        return builder.chanelHasOnlyBroadcast(SearchableBooleanFilterInput.builder().ne(Boolean.TRUE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$chatChannelOptionTypes$30(kp8 kp8Var) {
        return !Objects.isNull(kp8Var.chatChannelFilterInputBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$chatParticipantOptionTypes$28(kp8 kp8Var) {
        return (Objects.isNull(kp8Var.chatParticipantInputBuilder) && Objects.isNull(kp8Var.chatMentionsInputBuilder)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatMentionsFilterInput.Builder lambda$mentionsFilterInput$19(String str, String str2, SearchableChatMentionsFilterInput.Builder builder) {
        return builder.accountId(SearchableIDFilterInput.builder().eq(str).build()).mentionedUserId(SearchableIDFilterInput.builder().eq(str2).build()).status(SearchableStringFilterInput.builder().ne("INACTIVE").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$32(String str, kp8 kp8Var) {
        return kp8Var.optionType.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$of$33() {
        return new RuntimeException("Couldn't find view option for input option type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$participantFilterInput$16(String str, String str2, SearchableChatParticipantFilterInput.Builder builder) {
        return builder.accountId(SearchableIDFilterInput.builder().eq(str).build()).participantId(SearchableIDFilterInput.builder().eq(str2).build()).participationStatus(SearchableStringFilterInput.builder().ne("INACTIVE").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$participantFilterInput$17(SearchableChatParticipantFilterInput.Builder builder, String str) {
        return builder.channelName(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str)).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$participantFilterInput$18(String str, final SearchableChatParticipantFilterInput.Builder builder) {
        return (SearchableChatParticipantFilterInput.Builder) Optional.ofNullable(str).map(new Function() { // from class: o.zo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$participantFilterInput$17(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$0() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().eq("INTERNAL").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).orElse(Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$10() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().eq("INTERNAL").build()).participantScopeIfInternal(SearchableStringFilterInput.builder().eq("GROUP").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$11(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL"));
        Boolean bool = Boolean.FALSE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) Optional.ofNullable(chatParticipant.getParticipantScopeIfInternal()).map(new ui2("GROUP")).orElse(bool)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$12(ChatChannel chatChannel) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$13() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().eq("INTERNAL").build()).isStarred(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$14(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL"));
        Boolean bool = Boolean.FALSE;
        return ((Boolean) map.orElse(bool)).booleanValue() && Objects.equals(chatParticipant.getIsStarred(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$15(ChatChannel chatChannel) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(ChatChannel chatChannel) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$3() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().eq("INTERNAL").build()).unreadMessageCount(SearchableIntFilterInput.builder().gt(0).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$4(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$5(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL"));
        Boolean bool = Boolean.FALSE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) Optional.ofNullable(chatParticipant.getUnreadMessageCount()).map(new Function() { // from class: o.io8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$static$4((Integer) obj);
            }
        }).orElse(bool)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$6(ChatChannel chatChannel) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$7() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().eq("INTERNAL").build()).participantScopeIfInternal(SearchableStringFilterInput.builder().eq("DIRECT").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$8(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL"));
        Boolean bool = Boolean.FALSE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) Optional.ofNullable(chatParticipant.getParticipantScopeIfInternal()).map(new ui2("DIRECT")).orElse(bool)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$9(ChatChannel chatChannel) {
        return false;
    }

    public static kp8 of(final String str) {
        return (kp8) Arrays.stream(values()).filter(new Predicate() { // from class: o.wo8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return kp8.lambda$of$32(str, (kp8) obj);
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: o.xo8
            @Override // java.util.function.Supplier
            public final Object get() {
                return kp8.lambda$of$33();
            }
        });
    }

    public SearchableChatChannelFilterInput channelFilterInput(final String str, final String str2, final String str3, final String str4) {
        return (SearchableChatChannelFilterInput) Optional.ofNullable(this.chatChannelFilterInputBuilder).map(new tj2()).map(new Function() { // from class: o.mo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$20(str, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.oo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$22(str2, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.po8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$24(str3, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.qo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$26(str4, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.ro8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$channelFilterInput$27((SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new zj2()).orElse(null);
    }

    public x6c filterChatChannelSubscription(x6c x6cVar) {
        return x6cVar.m55714J(this.chatChannelSubscriptionFilter);
    }

    public x6c filterChatMentionsSubscription(x6c x6cVar) {
        return x6cVar.m55714J(this.chatMentionsSubscriptionFilter);
    }

    public x6c filterChatParticipantSubscription(x6c x6cVar) {
        return x6cVar.m55714J(this.chatParticipantSubscriptionFilter);
    }

    public String getOptionType() {
        return this.optionType;
    }

    public SearchableChatMentionsFilterInput mentionsFilterInput(final String str, final String str2, String str3) {
        return (SearchableChatMentionsFilterInput) Optional.ofNullable(this.chatMentionsInputBuilder).map(new gj2()).map(new Function() { // from class: o.so8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$mentionsFilterInput$19(str, str2, (SearchableChatMentionsFilterInput.Builder) obj);
            }
        }).map(new ij2()).orElse(null);
    }

    public SearchableChatParticipantFilterInput participantFilterInput(final String str, final String str2, final String str3) {
        return (SearchableChatParticipantFilterInput) Optional.ofNullable(this.chatParticipantInputBuilder).map(new nj2()).map(new Function() { // from class: o.bp8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$participantFilterInput$16(str, str2, (SearchableChatParticipantFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.cp8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kp8.lambda$participantFilterInput$18(str3, (SearchableChatParticipantFilterInput.Builder) obj);
            }
        }).map(new rj2()).orElse(null);
    }

    kp8(String str, Supplier supplier, ggd ggdVar) {
        this.optionType = str;
        this.chatParticipantInputBuilder = null;
        this.chatParticipantSubscriptionFilter = null;
        this.chatChannelFilterInputBuilder = null;
        this.chatChannelSubscriptionFilter = null;
        this.chatMentionsInputBuilder = supplier;
        this.chatMentionsSubscriptionFilter = ggdVar;
    }
}
