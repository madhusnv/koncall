package p001o;

import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.SubmittedFormValues;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes.dex */
public final class ta6 {

    /* renamed from: v */
    public static final C17042a f46712v = new C17042a(null);

    /* renamed from: w */
    public static final int f46713w = 8;

    /* renamed from: a */
    public final String f46714a;

    /* renamed from: b */
    public final String f46715b;

    /* renamed from: c */
    public final String f46716c;

    /* renamed from: d */
    public final String f46717d;

    /* renamed from: e */
    public final String f46718e;

    /* renamed from: f */
    public final String f46719f;

    /* renamed from: g */
    public final String f46720g;

    /* renamed from: h */
    public final Long f46721h;

    /* renamed from: i */
    public final String f46722i;

    /* renamed from: j */
    public final long f46723j;

    /* renamed from: k */
    public boolean f46724k;

    /* renamed from: l */
    public boolean f46725l;

    /* renamed from: m */
    public boolean f46726m;

    /* renamed from: n */
    public String f46727n;

    /* renamed from: o */
    public String f46728o;

    /* renamed from: p */
    public String f46729p;

    /* renamed from: q */
    public String f46730q;

    /* renamed from: r */
    public boolean f46731r;

    /* renamed from: s */
    public boolean f46732s;

    /* renamed from: t */
    public boolean f46733t;

    /* renamed from: u */
    public String f46734u;

    /* renamed from: o.ta6$a */
    public static final class C17042a {
        public C17042a() {
        }

        public /* synthetic */ C17042a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ta6 m49648a(String str, String str2, EngagementSummary engagementSummary) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(str2, "idType");
            sq8.m48649h(engagementSummary, "engagementSummary");
            String callOutcome = engagementSummary.getCallOutcome();
            String callOutcomeNature = engagementSummary.getCallOutcomeNature();
            String nextTaskType = engagementSummary.getNextTaskType();
            String body = engagementSummary.getBody();
            String customCallOutcomeData = engagementSummary.getCustomCallOutcomeData();
            Long nextFollowUpOn = engagementSummary.getNextFollowUpOn();
            String nextFollowUpSetBy = engagementSummary.getNextFollowUpSetBy();
            Long nextStepTaskDueDateTime = engagementSummary.getNextStepTaskDueDateTime();
            long jLongValue = nextStepTaskDueDateTime != null ? nextStepTaskDueDateTime.longValue() : 0L;
            boolean transferLeadOnNextStepTask = engagementSummary.getTransferLeadOnNextStepTask();
            boolean z = engagementSummary.getNextStepTaskAssignmentOutcome() != null;
            AssignmentOutcome nextStepTaskAssignmentOutcome = engagementSummary.getNextStepTaskAssignmentOutcome();
            String assignmentType = nextStepTaskAssignmentOutcome != null ? nextStepTaskAssignmentOutcome.getAssignmentType() : null;
            AssignmentOutcome nextStepTaskAssignmentOutcome2 = engagementSummary.getNextStepTaskAssignmentOutcome();
            String assignedUserId = nextStepTaskAssignmentOutcome2 != null ? nextStepTaskAssignmentOutcome2.getAssignedUserId() : null;
            AssignmentOutcome nextStepTaskAssignmentOutcome3 = engagementSummary.getNextStepTaskAssignmentOutcome();
            String assignedTeamId = nextStepTaskAssignmentOutcome3 != null ? nextStepTaskAssignmentOutcome3.getAssignedTeamId() : null;
            AssignmentOutcome nextStepTaskAssignmentOutcome4 = engagementSummary.getNextStepTaskAssignmentOutcome();
            String assignedDistributionId = nextStepTaskAssignmentOutcome4 != null ? nextStepTaskAssignmentOutcome4.getAssignedDistributionId() : null;
            AssignmentOutcome nextStepTaskAssignmentOutcome5 = engagementSummary.getNextStepTaskAssignmentOutcome();
            boolean assignOpenTasks = nextStepTaskAssignmentOutcome5 != null ? nextStepTaskAssignmentOutcome5.getAssignOpenTasks() : false;
            AssignmentOutcome nextStepTaskAssignmentOutcome6 = engagementSummary.getNextStepTaskAssignmentOutcome();
            boolean assignOpenDeals = nextStepTaskAssignmentOutcome6 != null ? nextStepTaskAssignmentOutcome6.getAssignOpenDeals() : false;
            AssignmentOutcome nextStepTaskAssignmentOutcome7 = engagementSummary.getNextStepTaskAssignmentOutcome();
            boolean assignChats = nextStepTaskAssignmentOutcome7 != null ? nextStepTaskAssignmentOutcome7.getAssignChats() : false;
            SubmittedFormValues submittedFormValues = engagementSummary.getSubmittedFormValues();
            return new ta6(str, str2, callOutcome, callOutcomeNature, nextTaskType, body, customCallOutcomeData, nextFollowUpOn, nextFollowUpSetBy, jLongValue, transferLeadOnNextStepTask, z, false, assignmentType, assignedUserId, assignedTeamId, assignedDistributionId, assignOpenTasks, assignOpenDeals, assignChats, submittedFormValues != null ? ja8.f30035c.toJson(submittedFormValues) : null);
        }
    }

    public ta6(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, long j, boolean z, boolean z2, boolean z3, String str9, String str10, String str11, String str12, boolean z4, boolean z5, boolean z6, String str13) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "idType");
        sq8.m48649h(str3, "callOutcome");
        sq8.m48649h(str4, "callOutcomeNature");
        this.f46714a = str;
        this.f46715b = str2;
        this.f46716c = str3;
        this.f46717d = str4;
        this.f46718e = str5;
        this.f46719f = str6;
        this.f46720g = str7;
        this.f46721h = l;
        this.f46722i = str8;
        this.f46723j = j;
        this.f46724k = z;
        this.f46725l = z2;
        this.f46726m = z3;
        this.f46727n = str9;
        this.f46728o = str10;
        this.f46729p = str11;
        this.f46730q = str12;
        this.f46731r = z4;
        this.f46732s = z5;
        this.f46733t = z6;
        this.f46734u = str13;
    }

    /* renamed from: a */
    public final boolean m49626a() {
        return this.f46733t;
    }

    /* renamed from: b */
    public final boolean m49627b() {
        return this.f46732s;
    }

    /* renamed from: c */
    public final boolean m49628c() {
        return this.f46731r;
    }

    /* renamed from: d */
    public final String m49629d() {
        return this.f46730q;
    }

    /* renamed from: e */
    public final String m49630e() {
        return this.f46729p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta6)) {
            return false;
        }
        ta6 ta6Var = (ta6) obj;
        return sq8.m48644c(this.f46714a, ta6Var.f46714a) && sq8.m48644c(this.f46715b, ta6Var.f46715b) && sq8.m48644c(this.f46716c, ta6Var.f46716c) && sq8.m48644c(this.f46717d, ta6Var.f46717d) && sq8.m48644c(this.f46718e, ta6Var.f46718e) && sq8.m48644c(this.f46719f, ta6Var.f46719f) && sq8.m48644c(this.f46720g, ta6Var.f46720g) && sq8.m48644c(this.f46721h, ta6Var.f46721h) && sq8.m48644c(this.f46722i, ta6Var.f46722i) && this.f46723j == ta6Var.f46723j && this.f46724k == ta6Var.f46724k && this.f46725l == ta6Var.f46725l && this.f46726m == ta6Var.f46726m && sq8.m48644c(this.f46727n, ta6Var.f46727n) && sq8.m48644c(this.f46728o, ta6Var.f46728o) && sq8.m48644c(this.f46729p, ta6Var.f46729p) && sq8.m48644c(this.f46730q, ta6Var.f46730q) && this.f46731r == ta6Var.f46731r && this.f46732s == ta6Var.f46732s && this.f46733t == ta6Var.f46733t && sq8.m48644c(this.f46734u, ta6Var.f46734u);
    }

    /* renamed from: f */
    public final String m49631f() {
        return this.f46728o;
    }

    /* renamed from: g */
    public final boolean m49632g() {
        return this.f46725l;
    }

    /* renamed from: h */
    public final String m49633h() {
        return this.f46727n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.f46714a.hashCode() * 31) + this.f46715b.hashCode()) * 31) + this.f46716c.hashCode()) * 31) + this.f46717d.hashCode()) * 31;
        String str = this.f46718e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46719f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46720g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f46721h;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f46722i;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.f46723j)) * 31;
        boolean z = this.f46724k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode6 + i) * 31;
        boolean z2 = this.f46725l;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f46726m;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str5 = this.f46727n;
        int iHashCode7 = (i6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f46728o;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f46729p;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f46730q;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        boolean z4 = this.f46731r;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (iHashCode10 + i7) * 31;
        boolean z5 = this.f46732s;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.f46733t;
        int i11 = (i10 + (z6 ? 1 : z6 ? 1 : 0)) * 31;
        String str9 = this.f46734u;
        return i11 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m49634i() {
        return this.f46719f;
    }

    /* renamed from: j */
    public final String m49635j() {
        return this.f46718e;
    }

    /* renamed from: k */
    public final String m49636k() {
        return this.f46716c;
    }

    /* renamed from: l */
    public final String m49637l() {
        return this.f46717d;
    }

    /* renamed from: m */
    public final String m49638m() {
        return this.f46720g;
    }

    /* renamed from: n */
    public final String m49639n() {
        return this.f46714a;
    }

    /* renamed from: o */
    public final String m49640o() {
        return this.f46715b;
    }

    /* renamed from: p */
    public final Long m49641p() {
        return this.f46721h;
    }

    /* renamed from: q */
    public final String m49642q() {
        return this.f46722i;
    }

    /* renamed from: r */
    public final long m49643r() {
        return this.f46723j;
    }

    /* renamed from: s */
    public final boolean m49644s() {
        return this.f46726m;
    }

    /* renamed from: t */
    public final String m49645t() {
        return this.f46734u;
    }

    public String toString() {
        return "EngagementOutcome(id=" + this.f46714a + ", idType=" + this.f46715b + ", callOutcome=" + this.f46716c + ", callOutcomeNature=" + this.f46717d + ", callNextStep=" + this.f46718e + ", callInputNotes=" + this.f46719f + ", customCallOutcomeData=" + this.f46720g + ", nextFollowUpOn=" + this.f46721h + ", nextFollowUpSetBy=" + this.f46722i + ", nextTaskDateTimeInMillis=" + this.f46723j + ", transferLead=" + this.f46724k + ", assignment=" + this.f46725l + ", persisted=" + this.f46726m + ", assignmentType=" + this.f46727n + ", assignedUserId=" + this.f46728o + ", assignedTeamId=" + this.f46729p + ", assignedDistributionId=" + this.f46730q + ", assignOpenTasks=" + this.f46731r + ", assignOpenDeals=" + this.f46732s + ", assignChats=" + this.f46733t + ", submittedFormValues=" + this.f46734u + ")";
    }

    /* renamed from: u */
    public final boolean m49646u() {
        return this.f46724k;
    }

    /* renamed from: v */
    public final void m49647v(boolean z) {
        this.f46726m = z;
    }
}
