package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class HomeProgress {
    public static final int $stable = 8;
    private int progressColor;
    private int progressIcon;
    private int progressLastCount;
    private int progressPercent;
    private String progressTitle;

    public HomeProgress() {
        this(0, 0, 0, null, 0, 31, null);
    }

    public static /* synthetic */ HomeProgress copy$default(HomeProgress homeProgress, int i, int i2, int i3, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = homeProgress.progressColor;
        }
        if ((i5 & 2) != 0) {
            i2 = homeProgress.progressIcon;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = homeProgress.progressPercent;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            str = homeProgress.progressTitle;
        }
        String str2 = str;
        if ((i5 & 16) != 0) {
            i4 = homeProgress.progressLastCount;
        }
        return homeProgress.copy(i, i6, i7, str2, i4);
    }

    public final int component1() {
        return this.progressColor;
    }

    public final int component2() {
        return this.progressIcon;
    }

    public final int component3() {
        return this.progressPercent;
    }

    public final String component4() {
        return this.progressTitle;
    }

    public final int component5() {
        return this.progressLastCount;
    }

    public final HomeProgress copy(int i, int i2, int i3, String str, int i4) {
        sq8.m48649h(str, "progressTitle");
        return new HomeProgress(i, i2, i3, str, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeProgress)) {
            return false;
        }
        HomeProgress homeProgress = (HomeProgress) obj;
        return this.progressColor == homeProgress.progressColor && this.progressIcon == homeProgress.progressIcon && this.progressPercent == homeProgress.progressPercent && sq8.m48644c(this.progressTitle, homeProgress.progressTitle) && this.progressLastCount == homeProgress.progressLastCount;
    }

    public final boolean getHasNewCounts() {
        return this.progressLastCount < this.progressPercent;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    public final int getProgressIcon() {
        return this.progressIcon;
    }

    public final int getProgressLastCount() {
        return this.progressLastCount;
    }

    public final int getProgressPercent() {
        return this.progressPercent;
    }

    public final String getProgressTitle() {
        return this.progressTitle;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.progressColor) * 31) + Integer.hashCode(this.progressIcon)) * 31) + Integer.hashCode(this.progressPercent)) * 31) + this.progressTitle.hashCode()) * 31) + Integer.hashCode(this.progressLastCount);
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
    }

    public final void setProgressIcon(int i) {
        this.progressIcon = i;
    }

    public final void setProgressLastCount(int i) {
        this.progressLastCount = i;
    }

    public final void setProgressPercent(int i) {
        this.progressPercent = i;
    }

    public final void setProgressTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.progressTitle = str;
    }

    public String toString() {
        return "HomeProgress(progressColor=" + this.progressColor + ", progressIcon=" + this.progressIcon + ", progressPercent=" + this.progressPercent + ", progressTitle=" + this.progressTitle + ", progressLastCount=" + this.progressLastCount + ")";
    }

    public HomeProgress(int i, int i2, int i3, String str, int i4) {
        sq8.m48649h(str, "progressTitle");
        this.progressColor = i;
        this.progressIcon = i2;
        this.progressPercent = i3;
        this.progressTitle = str;
        this.progressLastCount = i4;
    }

    public /* synthetic */ HomeProgress(int i, int i2, int i3, String str, int i4, int i5, id5 id5Var) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) == 0 ? i2 : -1, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? 0 : i4);
    }
}
