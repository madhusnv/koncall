package p001o;

import android.content.Context;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserStatus;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import p001o.s07;

/* loaded from: classes.dex */
public class mii {

    /* renamed from: a */
    public User f35523a;

    /* renamed from: b */
    public Account f35524b;

    /* renamed from: c */
    public Optional f35525c;

    /* renamed from: d */
    public final hi9 f35526d;

    /* renamed from: e */
    public final hi9 f35527e;

    /* renamed from: f */
    public AuthorizationLevel f35528f;

    /* renamed from: g */
    public final l1 f35529g;

    /* renamed from: o.mii$a */
    public static /* synthetic */ class C15339a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35530a;

        static {
            int[] iArr = new int[AuthorizationLevel.values().length];
            f35530a = iArr;
            try {
                iArr[AuthorizationLevel.ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35530a[AuthorizationLevel.MANAGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35530a[AuthorizationLevel.SUPERADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public mii(AccountMembership accountMembership) {
        this.f35526d = hi9.m30634e(new Supplier() { // from class: o.eii
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f21745a.m39148F();
            }
        });
        this.f35527e = hi9.m30634e(new Supplier() { // from class: o.fii
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f23432a.m39149G();
            }
        });
        this.f35529g = l1.tB(accountMembership, accountMembership.getAccount(), accountMembership.getUser());
        m39174x(accountMembership);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ User m39138B(Account account) {
        return this.f35523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ AccountMembership m39139C(User user) {
        return m39147E(this.f35523a.getId(), this.f35524b.getId());
    }

    /* renamed from: D */
    public static /* synthetic */ Boolean m39140D(AccountMembership accountMembership) {
        return Boolean.valueOf(accountMembership.getAllowedDeviceId() != null && s07.C16700a.m47387a(accountMembership));
    }

    /* renamed from: A */
    public boolean m39146A() {
        int i;
        return AccountType.INDIVIDUAL.equals(this.f35524b.getAccountType()) || (i = C15339a.f35530a[m39162l().ordinal()]) == 1 || i == 2 || i == 3;
    }

    /* renamed from: E */
    public final AccountMembership m39147E(String str, String str2) {
        try {
            return (AccountMembership) this.f35529g.L8(str, str2).m47698c();
        } catch (Exception unused) {
            String.format("Couldn't get account membership for account %s", str2);
            return null;
        }
    }

    /* renamed from: F */
    public final List m39148F() {
        return (List) lpi.m37623X().stream().map(new cii()).collect(Collectors.toList());
    }

    /* renamed from: G */
    public final List m39149G() {
        return (List) lpi.m37624Y().stream().map(new cii()).collect(Collectors.toList());
    }

    /* renamed from: H */
    public mii m39150H() {
        this.f35529g.uC();
        m39173w();
        return this;
    }

    /* renamed from: I */
    public boolean m39151I(Account account) {
        this.f35524b = account;
        return this.f35529g.tC(account);
    }

    /* renamed from: J */
    public void m39152J(Account account) {
        if (Objects.equals(account.getId(), this.f35524b.getId())) {
            this.f35524b = account;
        }
    }

    /* renamed from: K */
    public void m39153K(User user) {
        this.f35523a = user;
    }

    /* renamed from: L */
    public List m39154L() {
        return (List) Optional.ofNullable((List) this.f35526d.m51980C(Collections.emptyList())).orElse(Collections.emptyList());
    }

    /* renamed from: M */
    public List m39155M() {
        return (List) Optional.ofNullable((List) this.f35527e.m51980C(Collections.emptyList())).orElse(Collections.emptyList());
    }

    /* renamed from: f */
    public Account m39156f() {
        return this.f35524b;
    }

    /* renamed from: g */
    public String m39157g() {
        return (String) this.f35525c.map(new Function() { // from class: o.kii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AccountMembership) obj).getAccountEmail();
            }
        }).orElse(null);
    }

    /* renamed from: h */
    public Optional m39158h() {
        return this.f35525c;
    }

    /* renamed from: i */
    public Optional m39159i() {
        return this.f35525c.map(new Function() { // from class: o.bii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AccountMembership) obj).getId();
            }
        });
    }

    /* renamed from: j */
    public String m39160j() {
        return this.f35524b.getAccountName();
    }

    /* renamed from: k */
    public l1 m39161k() {
        return this.f35529g;
    }

    /* renamed from: l */
    public AuthorizationLevel m39162l() {
        return (AuthorizationLevel) Optional.ofNullable(this.f35528f).orElse(AuthorizationLevel.MEMBER);
    }

    /* renamed from: m */
    public String m39163m() {
        return this.f35524b.getBusinessLogoUrl();
    }

    /* renamed from: n */
    public String m39164n() {
        return (String) this.f35525c.map(new Function() { // from class: o.gii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AccountMembership) obj).getDesignation();
            }
        }).orElse("");
    }

    /* renamed from: o */
    public String m39165o() {
        return this.f35523a.getRegisteredEmail();
    }

    /* renamed from: p */
    public String m39166p() {
        return this.f35523a.getName();
    }

    /* renamed from: q */
    public String m39167q() {
        return this.f35523a.getRegisteredNumber();
    }

    /* renamed from: r */
    public String m39168r() {
        return m39171u().getProfilePictureUrl();
    }

    /* renamed from: s */
    public String m39169s() {
        return this.f35523a.getSecondaryNumber();
    }

    /* renamed from: t */
    public String m39170t() {
        return (String) this.f35525c.map(new Function() { // from class: o.lii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AccountMembership) obj).getSignature();
            }
        }).orElse("");
    }

    /* renamed from: u */
    public User m39171u() {
        return this.f35523a;
    }

    /* renamed from: v */
    public String m39172v() {
        return (String) this.f35525c.map(new Function() { // from class: o.aii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AccountMembership) obj).getUserAccountStatus();
            }
        }).map(new Function() { // from class: o.dii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UserStatus) obj).name();
            }
        }).orElse("INACTIVE");
    }

    /* renamed from: w */
    public final void m39173w() {
        this.f35524b = this.f35529g.mB();
        this.f35523a = this.f35529g.nB();
        this.f35525c = Optional.ofNullable(this.f35524b).map(new Function() { // from class: o.hii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f27038a.m39138B((Account) obj);
            }
        }).map(new Function() { // from class: o.iii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f28734a.m39139C((User) obj);
            }
        });
        this.f35528f = this.f35529g.oB().getAuthorizationLevel();
    }

    /* renamed from: x */
    public final void m39174x(AccountMembership accountMembership) {
        this.f35524b = accountMembership.getAccount();
        this.f35523a = this.f35529g.nB();
        this.f35525c = Optional.ofNullable(accountMembership);
        this.f35528f = this.f35529g.oB().getAuthorizationLevel();
    }

    /* renamed from: y */
    public boolean m39175y() {
        int i;
        return AccountType.INDIVIDUAL.equals(this.f35524b.getAccountType()) || (i = C15339a.f35530a[m39162l().ordinal()]) == 1 || i == 3;
    }

    /* renamed from: z */
    public boolean m39176z(Context context) {
        return ((Boolean) this.f35525c.map(new Function() { // from class: o.jii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mii.m39140D((AccountMembership) obj);
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public mii(AccountMembership accountMembership, Account account, User user) {
        this.f35526d = hi9.m30634e(new Supplier() { // from class: o.eii
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f21745a.m39148F();
            }
        });
        this.f35527e = hi9.m30634e(new Supplier() { // from class: o.fii
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f23432a.m39149G();
            }
        });
        this.f35529g = l1.tB(accountMembership, account, user);
        m39174x(accountMembership);
    }

    public mii(String str, String str2) {
        this(l1.uB(str2, str));
    }

    public mii(l1 l1Var) {
        this.f35526d = hi9.m30634e(new Supplier() { // from class: o.eii
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f21745a.m39148F();
            }
        });
        this.f35527e = hi9.m30634e(new Supplier() { // from class: o.fii
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f23432a.m39149G();
            }
        });
        this.f35529g = l1Var;
        m39173w();
    }
}
