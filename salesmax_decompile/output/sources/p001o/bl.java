package p001o;

import com.amazonaws.amplify.generated.graphql.CreateTeamAccountMutation;
import com.amazonaws.amplify.generated.graphql.GetAccountQuery;
import com.amazonaws.amplify.generated.graphql.RequestTrialExtensionMutation;
import com.amazonaws.amplify.generated.graphql.UpdateAccountMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.WorkingHour;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.CreateAccountInput;
import type.CreateTeamAccountInput;
import type.Day;
import type.UpdateAccountInput;
import type.WorkingHourInput;

/* loaded from: classes.dex */
public interface bl extends ja8 {
    static /* synthetic */ boolean Ab(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Ge(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ WorkingHourInput Gn(WorkingHour workingHour) {
        final WorkingHourInput.Builder builder = WorkingHourInput.builder();
        Optional map = Optional.ofNullable(workingHour.getDay()).map(new cd()).map(new dd());
        Objects.requireNonNull(builder);
        map.ifPresent(new Consumer() { // from class: o.uk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.day((Day) obj);
            }
        });
        Optional.ofNullable(workingHour.getEndTime()).map(new Function() { // from class: o.vk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Temporal.Time) obj).toDate();
            }
        }).map(new Function() { // from class: o.wk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((Date) obj).getTime());
            }
        }).map(new ko()).ifPresent(new Consumer() { // from class: o.tk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.endTime((String) obj);
            }
        });
        Optional.ofNullable(workingHour.getStartTime()).map(new Function() { // from class: o.vk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Temporal.Time) obj).toDate();
            }
        }).map(new Function() { // from class: o.wk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((Date) obj).getTime());
            }
        }).map(new ko()).ifPresent(new Consumer() { // from class: o.tk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.endTime((String) obj);
            }
        });
        return builder.build();
    }

    static /* synthetic */ boolean M3(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean N8(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Z5(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: i */
    static /* synthetic */ boolean m19308i(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean ja(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean mc(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean oh(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean tt(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean vc(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean x0(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean xg(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ RuntimeException zl(String str) {
        return new RuntimeException(String.format("Couldn't find account for input accountId: %s", str));
    }

    default x6c Bb(Account account) {
        return !StringUtils.isBlank(account.getId()) ? q6(xx(account)) : il(Ud(account));
    }

    default List Fx(List list) {
        return (List) list.stream().map(new Function() { // from class: o.rk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bl.Gn((WorkingHour) obj);
            }
        }).collect(Collectors.toList());
    }

    default CreateTeamAccountInput Ud(Account account) {
        final CreateTeamAccountInput.Builder builder = CreateTeamAccountInput.builder();
        final CreateAccountInput.Builder builder2 = CreateAccountInput.builder();
        Optional optionalFilter = Optional.ofNullable(account.getAccountName()).map(new u3c()).filter(new Predicate() { // from class: o.al
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.oh((String) obj);
            }
        });
        Objects.requireNonNull(builder2);
        optionalFilter.ifPresent(new Consumer() { // from class: o.bj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.accountName((String) obj);
            }
        });
        Optional.ofNullable(account.getBillingEmail()).map(new u3c()).filter(new Predicate() { // from class: o.hj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.ja((String) obj);
            }
        }).ifPresent(new ij(builder2));
        Optional.ofNullable(account.getIndustry()).map(new u3c()).filter(new Predicate() { // from class: o.jj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.vc((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.kj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.industry((String) obj);
            }
        });
        Optional.ofNullable(account.getDateFormat()).ifPresent(new Consumer() { // from class: o.mj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.dateFormat((String) obj);
            }
        });
        Optional.ofNullable(account.getDefaultCurrency()).ifPresent(new Consumer() { // from class: o.aj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.defaultCurrency((String) obj);
            }
        });
        Optional.ofNullable(account.getDenomination()).ifPresent(new Consumer() { // from class: o.lj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.denomination((String) obj);
            }
        });
        Optional.ofNullable(account.getNameOfBusiness()).map(new u3c()).filter(new Predicate() { // from class: o.wj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.tt((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.hk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.nameOfBusiness((String) obj);
            }
        });
        Optional.ofNullable(account.getProductOrService()).ifPresent(new Consumer() { // from class: o.sk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.productOrService((List) obj);
            }
        });
        Optional.ofNullable(account.getTaxId()).ifPresent(new Consumer() { // from class: o.xk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.taxId((String) obj);
            }
        });
        Optional.ofNullable(account.getTaxIdType()).ifPresent(new Consumer() { // from class: o.yk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.taxIdType((String) obj);
            }
        });
        Optional.ofNullable(account.getWebsite()).map(new u3c()).filter(new Predicate() { // from class: o.zk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.M3((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.qi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.website((String) obj);
            }
        });
        Optional.ofNullable(account.getTrialAccountEndDate()).map(new ri()).ifPresent(new Consumer() { // from class: o.si
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.trialAccountEndDate((String) obj);
            }
        });
        Optional.ofNullable(account.getTimeFormat()).ifPresent(new Consumer() { // from class: o.ti
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.timeFormat((String) obj);
            }
        });
        Optional.ofNullable(account.getTimeZone()).ifPresent(new Consumer() { // from class: o.ui
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.timeZone((String) obj);
            }
        });
        Optional.ofNullable(account.getWorkingHours()).map(new vi(this)).ifPresent(new Consumer() { // from class: o.wi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.workingHours((List) obj);
            }
        });
        Optional optionalFilter2 = Optional.ofNullable(account.getBillingEmail()).filter(new Predicate() { // from class: o.xi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.Z5((String) obj);
            }
        });
        Objects.requireNonNull(builder);
        optionalFilter2.ifPresent(new yi(builder));
        Optional map = Optional.ofNullable(account.getAccountType()).map(new Function() { // from class: o.zi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AccountType) obj).name();
            }
        });
        final String strName = AccountType.TEAM_TRIAL.name();
        Objects.requireNonNull(strName);
        map.map(new Function() { // from class: o.cj
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(strName.equals((String) obj));
            }
        }).ifPresent(new Consumer() { // from class: o.dj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isTrialAccount(((Boolean) obj).booleanValue());
            }
        });
        Optional.ofNullable(builder2.build()).ifPresent(new Consumer() { // from class: o.ej
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.accountInput((CreateAccountInput) obj);
            }
        });
        Optional.ofNullable(account.getBusinessLogoUrl()).map(new u3c()).filter(new Predicate() { // from class: o.fj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.m19308i((String) obj);
            }
        }).ifPresent(new gj(builder));
        return builder.build();
    }

    default Account fg(final String str) {
        return (Account) ((GraphQLResponse) ja8.z7(new SimpleGraphQLRequest("query GetAccount($id: ID!) {\n  getAccount(id: $id) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    pricePerSeat\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    locationPeriodicFrequency\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    dealMode\n    enableCustomCharts\n    createdAt\n    updatedAt\n    locationPeriodicFrequency\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n  }\n}", toVariablesMap(GetAccountQuery.builder().id(str).build()), Account.class, new GsonVariablesSerializer())).orElseThrow(new Supplier() { // from class: o.nj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bl.zl(str);
            }
        })).getData();
    }

    default x6c il(CreateTeamAccountInput createTeamAccountInput) {
        return graphqlMutation(CreateTeamAccountMutation.builder().input(createTeamAccountInput).build(), "mutation CreateTeamAccount($input: CreateTeamAccountInput!) {\n  createTeamAccount(input: $input) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    pricePerSeat\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    locationPeriodicFrequency\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    dealMode\n    enableCustomCharts\n    createdAt\n    updatedAt\n    locationPeriodicFrequency\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n  }\n}", CreateTeamAccountMutation.Data.class, new Function() { // from class: o.pi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateTeamAccountMutation.Data) obj).createTeamAccount();
            }
        }, Account.class);
    }

    default x6c q6(UpdateAccountInput updateAccountInput) {
        return graphqlMutation(UpdateAccountMutation.builder().input(updateAccountInput).build(), "mutation UpdateAccount($input: UpdateAccountInput!) {\n  updateAccount(input: $input) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    pricePerSeat\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    locationPeriodicFrequency\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    dealMode\n    enableCustomCharts\n    createdAt\n    updatedAt\n    locationPeriodicFrequency\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n  }\n}", UpdateAccountMutation.Data.class, new Function() { // from class: o.oj
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateAccountMutation.Data) obj).updateAccount();
            }
        }, Account.class);
    }

    default UpdateAccountInput xx(Account account) {
        final UpdateAccountInput.Builder builder = UpdateAccountInput.builder();
        Optional optionalOfNullable = Optional.ofNullable(account.getId());
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.sj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.id((String) obj);
            }
        });
        Optional.ofNullable(account.getAccountName()).map(new u3c()).filter(new Predicate() { // from class: o.lk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.x0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.mk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.accountName((String) obj);
            }
        });
        Optional.ofNullable(account.getBillingEmail()).map(new u3c()).filter(new Predicate() { // from class: o.nk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.xg((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.ok
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.billingEmail((String) obj);
            }
        });
        Optional.ofNullable(account.getBusinessLogoUrl()).map(new u3c()).filter(new Predicate() { // from class: o.pk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.Ge((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.qk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.businessLogoUrl((String) obj);
            }
        });
        Optional.ofNullable(account.getIndustry()).map(new u3c()).filter(new Predicate() { // from class: o.tj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.mc((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.uj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.industry((String) obj);
            }
        });
        Optional.ofNullable(account.getDateFormat()).ifPresent(new Consumer() { // from class: o.vj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.dateFormat((String) obj);
            }
        });
        Optional.ofNullable(account.getDefaultCurrency()).ifPresent(new Consumer() { // from class: o.xj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.defaultCurrency((String) obj);
            }
        });
        Optional.ofNullable(account.getDenomination()).ifPresent(new Consumer() { // from class: o.yj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.denomination((String) obj);
            }
        });
        Optional.ofNullable(account.getNameOfBusiness()).map(new u3c()).filter(new Predicate() { // from class: o.zj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.Ab((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.ak
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.nameOfBusiness((String) obj);
            }
        });
        Optional.ofNullable(account.getPermissions()).ifPresent(new Consumer() { // from class: o.bk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.permissions((List) obj);
            }
        });
        Optional.ofNullable(account.getProductOrService()).ifPresent(new Consumer() { // from class: o.ck
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.productOrService((List) obj);
            }
        });
        Optional.ofNullable(account.getTaxId()).ifPresent(new Consumer() { // from class: o.dk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.taxId((String) obj);
            }
        });
        Optional.ofNullable(account.getTaxIdType()).ifPresent(new Consumer() { // from class: o.ek
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.taxIdType((String) obj);
            }
        });
        Optional.ofNullable(account.getWebsite()).map(new u3c()).filter(new Predicate() { // from class: o.fk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bl.N8((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.gk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.website((String) obj);
            }
        });
        Optional.ofNullable(account.getTimeFormat()).ifPresent(new Consumer() { // from class: o.ik
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.timeFormat((String) obj);
            }
        });
        Optional.ofNullable(account.getTimeZone()).ifPresent(new Consumer() { // from class: o.jk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.timeZone((String) obj);
            }
        });
        Optional.ofNullable(account.getWorkingHours()).map(new vi(this)).ifPresent(new Consumer() { // from class: o.kk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.workingHours((List) obj);
            }
        });
        return builder.build();
    }

    default x6c ys(String str) {
        return graphqlMutation(RequestTrialExtensionMutation.builder().input(str).build(), RequestTrialExtensionMutation.Data.class, new Function() { // from class: o.rj
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((RequestTrialExtensionMutation.Data) obj).requestTrialExtension();
            }
        }, Account.class);
    }

    default x6c zf(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetAccount($id: ID!) {\n  getAccount(id: $id) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    pricePerSeat\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    locationPeriodicFrequency\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    dealMode\n    enableCustomCharts\n    createdAt\n    updatedAt\n    locationPeriodicFrequency\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      createdAt\n      updatedAt\n    }\n  }\n}", toVariablesMap(GetAccountQuery.builder().id(str).build()), Account.class, new GsonVariablesSerializer())).m55014i(new ggd() { // from class: o.pj
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f40162a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new rl7() { // from class: o.qj
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (Account) ((GraphQLResponse) obj).getData();
            }
        }).m27846n();
    }
}
