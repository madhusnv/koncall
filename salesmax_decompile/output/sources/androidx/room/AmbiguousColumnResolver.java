package androidx.room;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import p001o.bh3;
import p001o.ch3;
import p001o.dh3;
import p001o.dl8;
import p001o.gge;
import p001o.hh3;
import p001o.id5;
import p001o.kf9;
import p001o.kh3;
import p001o.kl8;
import p001o.mif;
import p001o.ql7;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    public static final class Match {
        private final List<Integer> resultIndices;
        private final kl8 resultRange;

        public Match(kl8 kl8Var, List<Integer> list) {
            sq8.m48649h(kl8Var, "resultRange");
            sq8.m48649h(list, "resultIndices");
            this.resultRange = kl8Var;
            this.resultIndices = list;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final kl8 getResultRange() {
            return this.resultRange;
        }
    }

    public static final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String str, int i) {
            sq8.m48649h(str, "name");
            this.name = str;
            this.index = i;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i2 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String str, int i) {
            sq8.m48649h(str, "name");
            return new ResultColumn(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return sq8.m48644c(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    public static final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(ch3.m21246k(), Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final Solution build(List<Match> list) {
                boolean z;
                sq8.m48649h(list, "matches");
                int i = 0;
                int iM32261j = 0;
                for (Match match : list) {
                    iM32261j += ((match.getResultRange().m32261j() - match.getResultRange().m32260e()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM32260e = ((Match) it.next()).getResultRange().m32260e();
                while (it.hasNext()) {
                    int iM32260e2 = ((Match) it.next()).getResultRange().m32260e();
                    if (iM32260e > iM32260e2) {
                        iM32260e = iM32260e2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM32261j2 = ((Match) it2.next()).getResultRange().m32261j();
                while (it2.hasNext()) {
                    int iM32261j3 = ((Match) it2.next()).getResultRange().m32261j();
                    if (iM32261j2 < iM32261j3) {
                        iM32261j2 = iM32261j3;
                    }
                }
                Iterable kl8Var = new kl8(iM32260e, iM32261j2);
                if (!(kl8Var instanceof Collection) || !((Collection) kl8Var).isEmpty()) {
                    Iterator it3 = kl8Var.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        int iMo23412a = ((dl8) it3).mo23412a();
                        Iterator<T> it4 = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                z = false;
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().m35829r(iMo23412a)) {
                                i3++;
                            }
                            if (i3 > 1) {
                                z = true;
                                break;
                            }
                        }
                        if (z && (i2 = i2 + 1) < 0) {
                            ch3.m21255t();
                        }
                    }
                    i = i2;
                }
                return new Solution(list, iM32261j, i);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }
        }

        public Solution(List<Match> list, int i, int i2) {
            sq8.m48649h(list, "matches");
            this.matches = list;
            this.coverageOffset = i;
            this.overlaps = i2;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution solution) {
            sq8.m48649h(solution, "other");
            int iM48651j = sq8.m48651j(this.overlaps, solution.overlaps);
            return iM48651j != 0 ? iM48651j : sq8.m48651j(this.coverageOffset, solution.coverageOffset);
        }
    }

    /* renamed from: androidx.room.AmbiguousColumnResolver$resolve$4 */
    public static final class C24164 extends kf9 implements xk7 {
        final /* synthetic */ gge $bestSolution;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24164(gge ggeVar) {
            super(1);
            this.$bestSolution = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<Match>) obj);
            return y3i.f54824a;
        }

        public final void invoke(List<Match> list) {
            sq8.m48649h(list, "it");
            Solution solutionBuild = Solution.Companion.build(list);
            if (solutionBuild.compareTo((Solution) this.$bestSolution.f25106a) < 0) {
                this.$bestSolution.f25106a = solutionBuild;
            }
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i, xk7 xk7Var) {
        if (i == list.size()) {
            xk7Var.invoke(kh3.Q0(list2));
            return;
        }
        Iterator<T> it = list.get(i).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i + 1, xk7Var);
            hh3.m30449I(list2);
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, xk7Var);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, ql7 ql7Var) {
        int i = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                ql7Var.invoke(Integer.valueOf(i), Integer.valueOf(length), list.subList(i, length));
            }
            i++;
            length++;
            if (length > list.size()) {
                return;
            } else {
                iHashCode2 = (iHashCode2 - list.get(i - 1).getName().hashCode()) + list.get(length - 1).getName().hashCode();
            }
        }
    }

    public static final int[][] resolve(String[] strArr, String[][] strArr2) {
        boolean z;
        sq8.m48649h(strArr, "resultColumns");
        sq8.m48649h(strArr2, "mappings");
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            String strSubstring = strArr[i2];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String lowerCase = strSubstring.toLowerCase(locale);
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            strArr[i2] = lowerCase;
            i2++;
        }
        int length2 = strArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int length3 = strArr2[i3].length;
            for (int i4 = 0; i4 < length3; i4++) {
                String[] strArr3 = strArr2[i3];
                String str = strArr3[i4];
                Locale locale2 = Locale.US;
                sq8.m48648g(locale2, "US");
                String lowerCase2 = str.toLowerCase(locale2);
                sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr3[i4] = lowerCase2;
            }
        }
        Set setM39135b = mif.m39135b();
        for (String[] strArr4 : strArr2) {
            hh3.m30442B(setM39135b, strArr4);
        }
        Set setM39134a = mif.m39134a(setM39135b);
        List listM18961c = bh3.m18961c();
        int length4 = strArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length4) {
            String str2 = strArr[i5];
            int i7 = i6 + 1;
            if (setM39134a.contains(str2)) {
                listM18961c.add(new ResultColumn(str2, i6));
            }
            i5++;
            i6 = i7;
        }
        List<ResultColumn> listM18959a = bh3.m18959a(listM18961c);
        int length5 = strArr2.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i8 = 0; i8 < length5; i8++) {
            arrayList.add(new ArrayList());
        }
        int length6 = strArr2.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length6) {
            String[] strArr5 = strArr2[i9];
            int i11 = i10 + 1;
            INSTANCE.rabinKarpSearch(listM18959a, strArr5, new AmbiguousColumnResolver$resolve$1$1(strArr5, arrayList, i10));
            if (((List) arrayList.get(i10)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr5.length);
                int length7 = strArr5.length;
                for (int i12 = i; i12 < length7; i12++) {
                    String str3 = strArr5[i12];
                    List listM18961c2 = bh3.m18961c();
                    for (ResultColumn resultColumn : listM18959a) {
                        if (sq8.m48644c(str3, resultColumn.getName())) {
                            listM18961c2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listM18959a2 = bh3.m18959a(listM18961c2);
                    if (!(!listM18959a2.isEmpty())) {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                    arrayList2.add(listM18959a2);
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i10), 6, null);
            }
            i9++;
            i10 = i11;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(!((List) it.next()).isEmpty())) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            throw new IllegalStateException("Failed to find matches for all mappings".toString());
        }
        gge ggeVar = new gge();
        ggeVar.f25106a = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new C24164(ggeVar), 6, null);
        List<Match> matches = ((Solution) ggeVar.f25106a).getMatches();
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(kh3.P0(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}
