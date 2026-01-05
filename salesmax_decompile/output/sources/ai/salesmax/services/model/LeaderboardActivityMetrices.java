package ai.salesmax.services.model;

import ai.salesmax.services.model.ActivityMetrices;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.LeaderboardActivityMetrices;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import p001o.uni;

/* loaded from: classes.dex */
public class LeaderboardActivityMetrices {
    private final Set<LeaderboardActivityMetrics> leaderboards = new TreeSet(Comparator.comparing(new Function() { // from class: o.zx9
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Long.valueOf(((LeaderboardActivityMetrics) obj).score());
        }
    }).reversed().thenComparing(new Function() { // from class: o.ay9
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((LeaderboardActivityMetrics) obj).getEntityId();
        }
    }).thenComparing(new Function() { // from class: o.by9
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((LeaderboardActivityMetrics) obj).getMetricsLevel();
        }
    }).thenComparing(new Function() { // from class: o.cy9
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((LeaderboardActivityMetrics) obj).getPeriod();
        }
    }));
    private final ActivityMetrics.Period period;
    private final String teamId;

    public LeaderboardActivityMetrices(String str, ActivityMetrics.Period period) {
        this.teamId = str;
        this.period = period;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getLeaderboardEntry$0(String str, LeaderboardActivityMetrics leaderboardActivityMetrics) {
        return Objects.equals(leaderboardActivityMetrics.getEntityId(), str);
    }

    public void addActivityMetrices(ActivityMetrices activityMetrices) {
        this.leaderboards.add(new LeaderboardActivityMetrics(activityMetrices, this.period));
    }

    public void addAllActivityMetrices(ActivityMetrices[] activityMetricesArr) {
        for (ActivityMetrices activityMetrices : activityMetricesArr) {
            addActivityMetrices(activityMetrices);
        }
    }

    public Collection<ActivityMetrices> getAllActivityMetrices() {
        TreeSet treeSet = new TreeSet(Comparator.comparing(new Function() { // from class: o.yx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ActivityMetrices) obj).getEntityId();
            }
        }));
        Iterator<LeaderboardActivityMetrics> it = this.leaderboards.iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().getActivityMetrices());
        }
        return treeSet;
    }

    public LeaderboardActivityMetrics getLeaderboardEntry(final String str) {
        return this.leaderboards.stream().filter(new Predicate() { // from class: o.xx9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeaderboardActivityMetrices.lambda$getLeaderboardEntry$0(str, (LeaderboardActivityMetrics) obj);
            }
        }).findFirst().orElse(null);
    }

    public Collection<LeaderboardActivityMetrics> getLeaderboards() {
        return this.leaderboards;
    }

    public LeaderboardActivityMetrics getMyLeaderboardEntry() {
        return getLeaderboardEntry(uni.kC().TB().Eo());
    }

    public int getMyRank() {
        return getRank(uni.kC().TB().Eo());
    }

    public int getRank(String str) {
        Iterator<LeaderboardActivityMetrics> it = this.leaderboards.iterator();
        int i = 1;
        while (it.hasNext()) {
            if (Objects.equals(it.next().getEntityId(), str)) {
                return i;
            }
            i++;
        }
        return this.leaderboards.size();
    }

    public void removeActivityMetrices(ActivityMetrices activityMetrices) {
        this.leaderboards.remove(new LeaderboardActivityMetrics(activityMetrices, this.period));
    }

    public int size() {
        return this.leaderboards.size();
    }
}
