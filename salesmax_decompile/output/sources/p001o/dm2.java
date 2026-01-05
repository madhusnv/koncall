package p001o;

import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.ChatChannel;
import com.amplifyframework.datastore.generated.model.ChatParticipant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
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
public enum dm2 {
    ALL("All", new Supplier() { // from class: o.dk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$0();
        }
    }, new ggd() { // from class: o.pk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$2((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.bl2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$3();
        }
    }, new ggd() { // from class: o.kl2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$5((ChatChannel) obj);
        }
    }),
    UNREAD("Unread", new Supplier() { // from class: o.ll2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$6();
        }
    }, new ggd() { // from class: o.ml2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$9((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.nl2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$10((ChatChannel) obj);
        }
    }),
    TIME_LEFT("Time Left", new Supplier() { // from class: o.ol2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$11();
        }
    }, new ggd() { // from class: o.pl2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$13((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.ql2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$14();
        }
    }, new ggd() { // from class: o.ek2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$16((ChatChannel) obj);
        }
    }),
    EXPIRED("Expired", new Supplier() { // from class: o.fk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$17();
        }
    }, new ggd() { // from class: o.gk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$19((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.hk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$20();
        }
    }, new ggd() { // from class: o.ik2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$22((ChatChannel) obj);
        }
    }),
    STARRED("Starred", new Supplier() { // from class: o.jk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$23();
        }
    }, new ggd() { // from class: o.kk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$25((ChatParticipant) obj);
        }
    }, null, new ggd() { // from class: o.lk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$27((ChatChannel) obj);
        }
    }),
    QUEUED("Unassigned", null, new ggd() { // from class: o.nk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$29((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.ok2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$30();
        }
    }, new ggd() { // from class: o.qk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$32((ChatChannel) obj);
        }
    }),
    AWAITING_FIRST_RESPONSE("Awaiting Response", new Supplier() { // from class: o.rk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$33();
        }
    }, new ggd() { // from class: o.sk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$35((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.tk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$36();
        }
    }, new ggd() { // from class: o.uk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$38((ChatChannel) obj);
        }
    }),
    LAST_MESSAGE_FROM_LEAD("Last Message From Lead", new Supplier() { // from class: o.vk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$39();
        }
    }, new ggd() { // from class: o.wk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$41((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.yk2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$42();
        }
    }, new ggd() { // from class: o.zk2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$44((ChatChannel) obj);
        }
    }),
    FAILED("Failed", new Supplier() { // from class: o.al2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$45();
        }
    }, new ggd() { // from class: o.cl2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$47((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.dl2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$48();
        }
    }, new ggd() { // from class: o.el2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$50((ChatChannel) obj);
        }
    }),
    RESOLVED("Resolved", new Supplier() { // from class: o.fl2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$51();
        }
    }, new ggd() { // from class: o.gl2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$53((ChatParticipant) obj);
        }
    }, new Supplier() { // from class: o.hl2
        @Override // java.util.function.Supplier
        public final Object get() {
            return dm2.lambda$static$54();
        }
    }, new ggd() { // from class: o.jl2
        @Override // p001o.ggd
        public final boolean test(Object obj) {
            return dm2.lambda$static$56((ChatChannel) obj);
        }
    });

    private Supplier<SearchableChatChannelFilterInput.Builder> chatChannelFilterInputBuilder;
    private ggd chatChannelSubscriptionFilter;
    private Supplier<SearchableChatMentionsFilterInput.Builder> chatMentionsInputBuilder;
    private ggd chatMentionsSubscriptionFilter;
    private Supplier<SearchableChatParticipantFilterInput.Builder> chatParticipantInputBuilder;
    private ggd chatParticipantSubscriptionFilter;
    private String optionType;

    dm2(String str, Supplier supplier, ggd ggdVar, Supplier supplier2, ggd ggdVar2) {
        this.optionType = str;
        this.chatParticipantInputBuilder = supplier;
        this.chatParticipantSubscriptionFilter = ggdVar;
        this.chatChannelFilterInputBuilder = supplier2;
        this.chatChannelSubscriptionFilter = ggdVar2;
        this.chatMentionsInputBuilder = null;
        this.chatMentionsSubscriptionFilter = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SearchableChatChannelFilterInput.Builder chatChannelFilterInputBuilderWithPrimaryTeamId(SearchableChatChannelFilterInput.Builder builder, String str) {
        return (StringUtils.isBlank(str) || "ALL".equalsIgnoreCase(str)) ? builder.or((List) wi0.m54450P().stream().map(new lj2()).map(new Function() { // from class: o.mj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$chatChannelFilterInputBuilderWithPrimaryTeamId$72((String) obj);
            }
        }).collect(Collectors.toList())) : builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static String[] chatChannelOptionTypes() {
        return (String[]) ((List) Arrays.stream(values()).filter(new Predicate() { // from class: o.cm2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return dm2.lambda$chatChannelOptionTypes$75((dm2) obj);
            }
        }).map(new Function() { // from class: o.vi2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dm2) obj).optionType;
            }
        }).collect(Collectors.toList())).toArray(new String[0]);
    }

    public static String[] chatParticipantOptionTypes() {
        return (String[]) ((List) Arrays.stream(values()).filter(new Predicate() { // from class: o.ul2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return dm2.lambda$chatParticipantOptionTypes$73((dm2) obj);
            }
        }).map(new Function() { // from class: o.vl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dm2) obj).optionType;
            }
        }).collect(Collectors.toList())).toArray(new String[0]);
    }

    private static Set<String> getAllowedTeamIds(String str) {
        return (StringUtils.isBlank(str) || "ALL".equalsIgnoreCase(str)) ? (Set) wi0.m54450P().stream().map(new lj2()).collect(Collectors.toSet()) : Collections.singleton(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$62(String str, SearchableChatChannelFilterInput.Builder builder) {
        return builder.accountId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$channelFilterInput$63(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$64(SearchableChatChannelFilterInput.Builder builder, String str) {
        return builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$65(String str, final SearchableChatChannelFilterInput.Builder builder) {
        return (SearchableChatChannelFilterInput.Builder) Optional.ofNullable(str).filter(new Predicate() { // from class: o.jj2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return dm2.lambda$channelFilterInput$63((String) obj);
            }
        }).map(new Function() { // from class: o.kj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$64(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$channelFilterInput$66(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$68(String str, final SearchableChatChannelFilterInput.Builder builder) {
        return (SearchableChatChannelFilterInput.Builder) Optional.ofNullable(str).filter(new Predicate() { // from class: o.dj2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return dm2.lambda$channelFilterInput$66((String) obj);
            }
        }).map(new Function() { // from class: o.ej2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.chatChannelFilterInputBuilderWithPrimaryTeamId(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$69(SearchableChatChannelFilterInput.Builder builder, String str) {
        return builder.channelName(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str)).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$70(String str, final SearchableChatChannelFilterInput.Builder builder) {
        return (SearchableChatChannelFilterInput.Builder) Optional.ofNullable(str).map(new Function() { // from class: o.tl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$69(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$channelFilterInput$71(SearchableChatChannelFilterInput.Builder builder) {
        return builder.chanelHasOnlyBroadcast(SearchableBooleanFilterInput.builder().ne(Boolean.TRUE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput lambda$chatChannelFilterInputBuilderWithPrimaryTeamId$72(String str) {
        return SearchableChatChannelFilterInput.builder().primaryTeamId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$chatChannelOptionTypes$75(dm2 dm2Var) {
        return !Objects.isNull(dm2Var.chatChannelFilterInputBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$chatParticipantOptionTypes$73(dm2 dm2Var) {
        return (Objects.isNull(dm2Var.chatParticipantInputBuilder) && Objects.isNull(dm2Var.chatMentionsInputBuilder)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$filterChatChannelSubscription$61(Set set, ChatChannel chatChannel) {
        return set.contains(chatChannel.getPrimaryTeamId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatMentionsFilterInput.Builder lambda$mentionsFilterInput$60(String str, String str2, SearchableChatMentionsFilterInput.Builder builder) {
        return builder.accountId(SearchableIDFilterInput.builder().eq(str).build()).mentionedUserId(SearchableIDFilterInput.builder().eq(str2).build()).status(SearchableStringFilterInput.builder().ne("INACTIVE").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$77(String str, dm2 dm2Var) {
        return dm2Var.optionType.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$of$78() {
        return new RuntimeException("Couldn't find view option for input option type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$participantFilterInput$57(String str, String str2, SearchableChatParticipantFilterInput.Builder builder) {
        return builder.accountId(SearchableIDFilterInput.builder().eq(str).build()).participantId(SearchableIDFilterInput.builder().eq(str2).build()).participationStatus(SearchableStringFilterInput.builder().ne("INACTIVE").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$participantFilterInput$58(SearchableChatParticipantFilterInput.Builder builder, String str) {
        return builder.channelName(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str)).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$participantFilterInput$59(String str, final SearchableChatParticipantFilterInput.Builder builder) {
        return (SearchableChatParticipantFilterInput.Builder) Optional.ofNullable(str).map(new Function() { // from class: o.wi2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$participantFilterInput$58(builder, (String) obj);
            }
        }).orElse(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$0() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$1(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$10(ChatChannel chatChannel) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$11() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).channelStatus(SearchableStringFilterInput.builder().ne("RESOLVED").build()).channelWillBeChargedNext(SearchableStringFilterInput.builder().gt(a81.m16652g(a81.m16641B())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$12(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$13(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.yl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$12((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && !Objects.equals(chatParticipant.getChannelStatus(), "RESOLVED") && chatParticipant.getChannelWillBeChargedNext().getOffsetTotalSeconds() > a81.m16641B().getOffsetTotalSeconds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$14() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).channelStatus(SearchableStringFilterInput.builder().ne("RESOLVED").build()).channelWillBeChargedNext(SearchableStringFilterInput.builder().gt(a81.m16652g(a81.m16641B())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$15(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$16(ChatChannel chatChannel) {
        return !Objects.equals(chatChannel.getChannelStatus(), "RESOLVED") && ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.bj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$15((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && chatChannel.getChannelWillBeChargedNext().getOffsetTotalSeconds() > a81.m16641B().getOffsetTotalSeconds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$17() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).channelStatus(SearchableStringFilterInput.builder().ne("RESOLVED").build()).channelWillBeChargedNext(SearchableStringFilterInput.builder().lt(a81.m16652g(a81.m16641B())).build()).channelOpenUntil(SearchableStringFilterInput.builder().lt(a81.m16652g(a81.m16641B())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$18(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$19(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.ck2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$18((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && !Objects.equals(chatParticipant.getChannelStatus(), "RESOLVED") && chatParticipant.getChannelWillBeChargedNext().getOffsetTotalSeconds() < a81.m16641B().getOffsetTotalSeconds() && chatParticipant.getChannelOpenUntil().getOffsetTotalSeconds() < a81.m16641B().getOffsetTotalSeconds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.bk2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$1((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$20() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).channelStatus(SearchableStringFilterInput.builder().ne("RESOLVED").build()).channelWillBeChargedNext(SearchableStringFilterInput.builder().lt(a81.m16652g(a81.m16641B())).build()).channelOpenUntil(SearchableStringFilterInput.builder().lt(a81.m16652g(a81.m16641B())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$21(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$22(ChatChannel chatChannel) {
        return ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.rl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$21((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && !Objects.equals(chatChannel.getChannelStatus(), "RESOLVED") && chatChannel.getChannelWillBeChargedNext().getOffsetTotalSeconds() < a81.m16641B().getOffsetTotalSeconds() && chatChannel.getChannelOpenUntil().getOffsetTotalSeconds() < a81.m16641B().getOffsetTotalSeconds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$23() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).isStarred(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$24(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$25(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.il2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$24((Boolean) obj);
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && Objects.equals(chatParticipant.getIsStarred(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$26(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$27(ChatChannel chatChannel) {
        return ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.cj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$26((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$28(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$29(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.zl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$28((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$3() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$30() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).toBeAssigned(SearchableStringFilterInput.builder().eq("UNASSIGNED").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$31(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$32(ChatChannel chatChannel) {
        return ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.sl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$31((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && Objects.equals(chatChannel.getToBeAssigned(), "UNASSIGNED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$33() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).isLastMessageByLead(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build()).lastMessageByUserTime(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$34(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$35(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.wl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$34((Boolean) obj);
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && Objects.equals(chatParticipant.getIsLastMessageByLead(), bool) && !Objects.isNull(chatParticipant.getLastMessageByUserTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$36() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).isLastMessageByLead(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build()).lastMessageByUserTime(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$37(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$38(ChatChannel chatChannel) {
        Optional map = Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.yi2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$37((Boolean) obj);
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && Objects.equals(chatChannel.getIsLastMessageByLead(), bool) && !Objects.isNull(chatChannel.getLastMessageByUserTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$39() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).isLastMessageByLead(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$4(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$40(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$41(ChatParticipant chatParticipant) {
        Optional map = Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.xi2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$40((Boolean) obj);
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && Objects.equals(chatParticipant.getIsLastMessageByLead(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$42() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).isLastMessageByLead(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$43(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$44(ChatChannel chatChannel) {
        Optional map = Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.sj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$43((Boolean) obj);
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && Objects.equals(chatChannel.getIsLastMessageByLead(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$45() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).lastOutboundMessageStatus(SearchableStringFilterInput.builder().eq("failed").build()).isLastMessageByLead(SearchableBooleanFilterInput.builder().eq(Boolean.FALSE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$46(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$47(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.bm2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$46((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && Objects.equals(chatParticipant.getLastOutboundMessageStatus(), "failed") && Objects.equals(chatParticipant.getIsLastMessageByLead(), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$48() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).lastOutboundMessageStatus(SearchableStringFilterInput.builder().eq("failed").build()).isLastMessageByLead(SearchableBooleanFilterInput.builder().eq(Boolean.FALSE).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$49(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$5(ChatChannel chatChannel) {
        return ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.am2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$4((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$50(ChatChannel chatChannel) {
        return ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.xl2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$49((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && Objects.equals(chatChannel.getLastOutboundMessageStatus(), "failed") && Objects.equals(chatChannel.getIsLastMessageByLead(), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$51() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).channelStatus(SearchableStringFilterInput.builder().eq("RESOLVED").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$52(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$53(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.fj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$52((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && Objects.equals(chatParticipant.getChannelStatus(), "RESOLVED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatChannelFilterInput.Builder lambda$static$54() {
        return SearchableChatChannelFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).channelStatus(SearchableStringFilterInput.builder().eq("RESOLVED").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$55(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$56(ChatChannel chatChannel) {
        return ((Boolean) Optional.ofNullable(chatChannel.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.qj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$55((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && Objects.equals(chatChannel.getChannelStatus(), "RESOLVED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SearchableChatParticipantFilterInput.Builder lambda$static$6() {
        return SearchableChatParticipantFilterInput.builder().channelType(SearchableStringFilterInput.builder().ne("INTERNAL").build()).unreadMessageCount(SearchableIntFilterInput.builder().gt(0).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$7(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$8(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$9(ChatParticipant chatParticipant) {
        return ((Boolean) Optional.ofNullable(chatParticipant.getChannelType()).map(new ui2("INTERNAL")).map(new Function() { // from class: o.mk2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$7((Boolean) obj);
            }
        }).orElse(Boolean.TRUE)).booleanValue() && ((Boolean) Optional.ofNullable(chatParticipant.getUnreadMessageCount()).map(new Function() { // from class: o.xk2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$static$8((Integer) obj);
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public static dm2 of(final String str) {
        return (dm2) Arrays.stream(values()).filter(new Predicate() { // from class: o.zi2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return dm2.lambda$of$77(str, (dm2) obj);
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: o.aj2
            @Override // java.util.function.Supplier
            public final Object get() {
                return dm2.lambda$of$78();
            }
        });
    }

    public SearchableChatChannelFilterInput channelFilterInput(final String str, final String str2, final String str3, final String str4) {
        return (SearchableChatChannelFilterInput) Optional.ofNullable(this.chatChannelFilterInputBuilder).map(new tj2()).map(new Function() { // from class: o.uj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$62(str, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.vj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$65(str2, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.wj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$68(str3, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.xj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$70(str4, (SearchableChatChannelFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.yj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$channelFilterInput$71((SearchableChatChannelFilterInput.Builder) obj);
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
        return (SearchableChatMentionsFilterInput) Optional.ofNullable(this.chatMentionsInputBuilder).map(new gj2()).map(new Function() { // from class: o.hj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$mentionsFilterInput$60(str, str2, (SearchableChatMentionsFilterInput.Builder) obj);
            }
        }).map(new ij2()).orElse(null);
    }

    public SearchableChatParticipantFilterInput participantFilterInput(final String str, final String str2, final String str3) {
        return (SearchableChatParticipantFilterInput) Optional.ofNullable(this.chatParticipantInputBuilder).map(new nj2()).map(new Function() { // from class: o.oj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$participantFilterInput$57(str, str2, (SearchableChatParticipantFilterInput.Builder) obj);
            }
        }).map(new Function() { // from class: o.pj2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dm2.lambda$participantFilterInput$59(str3, (SearchableChatParticipantFilterInput.Builder) obj);
            }
        }).map(new rj2()).orElse(null);
    }

    public x6c filterChatChannelSubscription(x6c x6cVar, String str) {
        if (StringUtils.isBlank(str)) {
            return filterChatChannelSubscription(x6cVar);
        }
        final Set<String> allowedTeamIds = getAllowedTeamIds(str);
        return x6cVar.m55714J(new ggd() { // from class: o.ak2
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return dm2.lambda$filterChatChannelSubscription$61(allowedTeamIds, (ChatChannel) obj);
            }
        }).m55714J(this.chatChannelSubscriptionFilter);
    }

    dm2(String str, Supplier supplier, ggd ggdVar) {
        this.optionType = str;
        this.chatParticipantInputBuilder = null;
        this.chatParticipantSubscriptionFilter = null;
        this.chatChannelFilterInputBuilder = null;
        this.chatChannelSubscriptionFilter = null;
        this.chatMentionsInputBuilder = supplier;
        this.chatMentionsSubscriptionFilter = ggdVar;
    }
}
