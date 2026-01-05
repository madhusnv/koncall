package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class HomeProgressList {
    public static final int $stable = 8;
    private HomeProgress progressFour;
    private HomeProgress progressOne;
    private HomeProgress progressThree;
    private HomeProgress progressTwo;

    public HomeProgressList() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HomeProgressList copy$default(HomeProgressList homeProgressList, HomeProgress homeProgress, HomeProgress homeProgress2, HomeProgress homeProgress3, HomeProgress homeProgress4, int i, Object obj) {
        if ((i & 1) != 0) {
            homeProgress = homeProgressList.progressOne;
        }
        if ((i & 2) != 0) {
            homeProgress2 = homeProgressList.progressTwo;
        }
        if ((i & 4) != 0) {
            homeProgress3 = homeProgressList.progressThree;
        }
        if ((i & 8) != 0) {
            homeProgress4 = homeProgressList.progressFour;
        }
        return homeProgressList.copy(homeProgress, homeProgress2, homeProgress3, homeProgress4);
    }

    public final HomeProgress component1() {
        return this.progressOne;
    }

    public final HomeProgress component2() {
        return this.progressTwo;
    }

    public final HomeProgress component3() {
        return this.progressThree;
    }

    public final HomeProgress component4() {
        return this.progressFour;
    }

    public final HomeProgressList copy(HomeProgress homeProgress, HomeProgress homeProgress2, HomeProgress homeProgress3, HomeProgress homeProgress4) {
        sq8.m48649h(homeProgress, "progressOne");
        sq8.m48649h(homeProgress2, "progressTwo");
        sq8.m48649h(homeProgress3, "progressThree");
        sq8.m48649h(homeProgress4, "progressFour");
        return new HomeProgressList(homeProgress, homeProgress2, homeProgress3, homeProgress4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeProgressList)) {
            return false;
        }
        HomeProgressList homeProgressList = (HomeProgressList) obj;
        return sq8.m48644c(this.progressOne, homeProgressList.progressOne) && sq8.m48644c(this.progressTwo, homeProgressList.progressTwo) && sq8.m48644c(this.progressThree, homeProgressList.progressThree) && sq8.m48644c(this.progressFour, homeProgressList.progressFour);
    }

    public final HomeProgress getProgressFour() {
        return this.progressFour;
    }

    public final HomeProgress getProgressOne() {
        return this.progressOne;
    }

    public final HomeProgress getProgressThree() {
        return this.progressThree;
    }

    public final HomeProgress getProgressTwo() {
        return this.progressTwo;
    }

    public int hashCode() {
        return (((((this.progressOne.hashCode() * 31) + this.progressTwo.hashCode()) * 31) + this.progressThree.hashCode()) * 31) + this.progressFour.hashCode();
    }

    public final void setProgressFour(HomeProgress homeProgress) {
        sq8.m48649h(homeProgress, "<set-?>");
        this.progressFour = homeProgress;
    }

    public final void setProgressOne(HomeProgress homeProgress) {
        sq8.m48649h(homeProgress, "<set-?>");
        this.progressOne = homeProgress;
    }

    public final void setProgressThree(HomeProgress homeProgress) {
        sq8.m48649h(homeProgress, "<set-?>");
        this.progressThree = homeProgress;
    }

    public final void setProgressTwo(HomeProgress homeProgress) {
        sq8.m48649h(homeProgress, "<set-?>");
        this.progressTwo = homeProgress;
    }

    public String toString() {
        return "HomeProgressList(progressOne=" + this.progressOne + ", progressTwo=" + this.progressTwo + ", progressThree=" + this.progressThree + ", progressFour=" + this.progressFour + ")";
    }

    public HomeProgressList(HomeProgress homeProgress, HomeProgress homeProgress2, HomeProgress homeProgress3, HomeProgress homeProgress4) {
        sq8.m48649h(homeProgress, "progressOne");
        sq8.m48649h(homeProgress2, "progressTwo");
        sq8.m48649h(homeProgress3, "progressThree");
        sq8.m48649h(homeProgress4, "progressFour");
        this.progressOne = homeProgress;
        this.progressTwo = homeProgress2;
        this.progressThree = homeProgress3;
        this.progressFour = homeProgress4;
    }

    public /* synthetic */ HomeProgressList(HomeProgress homeProgress, HomeProgress homeProgress2, HomeProgress homeProgress3, HomeProgress homeProgress4, int i, id5 id5Var) {
        this((i & 1) != 0 ? new HomeProgress(0, 0, 0, null, 0, 31, null) : homeProgress, (i & 2) != 0 ? new HomeProgress(0, 0, 0, null, 0, 31, null) : homeProgress2, (i & 4) != 0 ? new HomeProgress(0, 0, 0, null, 0, 31, null) : homeProgress3, (i & 8) != 0 ? new HomeProgress(0, 0, 0, null, 0, 31, null) : homeProgress4);
    }
}
