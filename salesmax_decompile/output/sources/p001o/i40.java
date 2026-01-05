package p001o;

import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.FormFields;
import ai.salesmax.model.Tasks;

/* loaded from: classes.dex */
public interface i40 {

    /* renamed from: o.i40$a */
    public static final class C14153a {
        /* renamed from: a */
        public static void m31476a(i40 i40Var, EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "summary");
        }

        /* renamed from: b */
        public static void m31477b(i40 i40Var, EngagementSummary engagementSummary, FormFields formFields, Boolean bool, Boolean bool2) {
            sq8.m48649h(engagementSummary, "summary");
        }

        /* renamed from: c */
        public static void m31478c(i40 i40Var, EngagementSummary engagementSummary, Tasks tasks, boolean z) {
            sq8.m48649h(engagementSummary, "summary");
            sq8.m48649h(tasks, "task");
        }

        /* renamed from: d */
        public static void m31479d(i40 i40Var, Tasks tasks) {
            sq8.m48649h(tasks, "summary");
        }

        /* renamed from: e */
        public static String m31480e(i40 i40Var, EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "summary");
            return null;
        }
    }

    /* renamed from: a */
    void mo981a(EngagementSummary engagementSummary, FormFields formFields, Boolean bool, Boolean bool2);

    /* renamed from: b */
    void mo982b(Tasks tasks);

    /* renamed from: c */
    String mo983c(EngagementSummary engagementSummary);

    /* renamed from: d */
    void mo984d(EngagementSummary engagementSummary, Tasks tasks, boolean z);

    /* renamed from: e */
    void mo985e(EngagementSummary engagementSummary);
}
