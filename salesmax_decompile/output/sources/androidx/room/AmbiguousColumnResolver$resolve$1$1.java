package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.kf9;
import p001o.kl8;
import p001o.ql7;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver$resolve$1$1 extends kf9 implements ql7 {
    final /* synthetic */ String[] $mapping;
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$1(String[] strArr, List<? extends List<AmbiguousColumnResolver.Match>> list, int i) {
        super(3);
        this.$mapping = strArr;
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    @Override // p001o.ql7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (List<AmbiguousColumnResolver.ResultColumn>) obj3);
        return y3i.f54824a;
    }

    public final void invoke(int i, int i2, List<AmbiguousColumnResolver.ResultColumn> list) {
        Object next;
        sq8.m48649h(list, "resultColumnsSublist");
        String[] strArr = this.$mapping;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (sq8.m48644c(str, ((AmbiguousColumnResolver.ResultColumn) next).component1())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) next;
            if (resultColumn == null) {
                return;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new kl8(i, i2 - 1), arrayList));
    }
}
