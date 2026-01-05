package p001o;

import ai.salesmax.model.HomeProgress;
import ai.salesmax.model.HomeProgressList;

/* loaded from: classes.dex */
public abstract class gz7 {
    /* renamed from: a */
    public static x6c m29675a() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: b */
    public static HomeProgressList m29676b(HomeProgressList homeProgressList, pt4 pt4Var, String str) {
        try {
            g0i g0iVarU9 = ((l1) m29675a().m55727f()).U9();
            HomeProgress[] homeProgressArr = {homeProgressList.getProgressOne(), homeProgressList.getProgressTwo(), homeProgressList.getProgressThree(), homeProgressList.getProgressFour()};
            for (int i = 0; i < 4; i++) {
                HomeProgress homeProgress = homeProgressArr[i];
                homeProgress.setProgressLastCount(g0iVarU9.m27879e(homeProgress.getProgressTitle(), pt4Var, str).intValue());
            }
            return homeProgressList;
        } catch (Exception e) {
            throw new RuntimeException("Failed to get APIService instance", e);
        }
    }
}
