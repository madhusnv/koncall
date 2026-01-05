package androidx.work;

import androidx.work.Data;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.hwc;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        sq8.m48649h(data, "<this>");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48655n(4, "T");
        return data.hasKeyWithValueOfType(str, Object.class);
    }

    public static final Data workDataOf(hwc... hwcVarArr) throws Throwable {
        sq8.m48649h(hwcVarArr, "pairs");
        Data.Builder builder = new Data.Builder();
        for (hwc hwcVar : hwcVarArr) {
            builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
        }
        Data dataBuild = builder.build();
        sq8.m48648g(dataBuild, "dataBuilder.build()");
        return dataBuild;
    }
}
