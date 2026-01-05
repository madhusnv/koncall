package ai.salesmax.model;

import ai.salesmax.services.model.ActivityMetrices;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import com.amplifyframework.datastore.generated.model.MetricsLevel;
import java.util.ArrayList;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class HomeLeaderBoard {
    public static final int $stable = 8;
    private ArrayList<LeaderboardActivityMetrics> leaderBoardList;
    private LeaderboardActivityMetrics myRank;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeLeaderBoard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeLeaderBoard copy$default(HomeLeaderBoard homeLeaderBoard, LeaderboardActivityMetrics leaderboardActivityMetrics, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            leaderboardActivityMetrics = homeLeaderBoard.myRank;
        }
        if ((i & 2) != 0) {
            arrayList = homeLeaderBoard.leaderBoardList;
        }
        return homeLeaderBoard.copy(leaderboardActivityMetrics, arrayList);
    }

    public final LeaderboardActivityMetrics component1() {
        return this.myRank;
    }

    public final ArrayList<LeaderboardActivityMetrics> component2() {
        return this.leaderBoardList;
    }

    public final HomeLeaderBoard copy(LeaderboardActivityMetrics leaderboardActivityMetrics, ArrayList<LeaderboardActivityMetrics> arrayList) {
        sq8.m48649h(arrayList, "leaderBoardList");
        return new HomeLeaderBoard(leaderboardActivityMetrics, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeLeaderBoard)) {
            return false;
        }
        HomeLeaderBoard homeLeaderBoard = (HomeLeaderBoard) obj;
        return sq8.m48644c(this.myRank, homeLeaderBoard.myRank) && sq8.m48644c(this.leaderBoardList, homeLeaderBoard.leaderBoardList);
    }

    public final ArrayList<LeaderboardActivityMetrics> getLeaderBoardList() {
        return this.leaderBoardList;
    }

    public final LeaderboardActivityMetrics getMyRank() {
        return this.myRank;
    }

    public int hashCode() {
        LeaderboardActivityMetrics leaderboardActivityMetrics = this.myRank;
        return ((leaderboardActivityMetrics == null ? 0 : leaderboardActivityMetrics.hashCode()) * 31) + this.leaderBoardList.hashCode();
    }

    public final void setLeaderBoardList(ArrayList<LeaderboardActivityMetrics> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.leaderBoardList = arrayList;
    }

    public final void setMyRank(LeaderboardActivityMetrics leaderboardActivityMetrics) {
        this.myRank = leaderboardActivityMetrics;
    }

    public String toString() {
        return "HomeLeaderBoard(myRank=" + this.myRank + ", leaderBoardList=" + this.leaderBoardList + ")";
    }

    public HomeLeaderBoard(LeaderboardActivityMetrics leaderboardActivityMetrics, ArrayList<LeaderboardActivityMetrics> arrayList) {
        sq8.m48649h(arrayList, "leaderBoardList");
        this.myRank = leaderboardActivityMetrics;
        this.leaderBoardList = arrayList;
    }

    public /* synthetic */ HomeLeaderBoard(LeaderboardActivityMetrics leaderboardActivityMetrics, ArrayList arrayList, int i, id5 id5Var) {
        this((i & 1) != 0 ? new LeaderboardActivityMetrics(new ActivityMetrices("", MetricsLevel.USER), ActivityMetrics.Period.DAY) : leaderboardActivityMetrics, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
