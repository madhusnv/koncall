package p001o;

import ai.salesmax.model.CallEvent;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.CallLog;
import android.provider.MediaStore;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CallDirection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.rz1;

/* loaded from: classes.dex */
public final class h4e {

    /* renamed from: a */
    public static final h4e f26198a = new h4e();

    /* renamed from: o.h4e$a */
    public static final class C13848a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13848a f26199a = new C13848a();

        public C13848a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m29810a(long j) {
            return "?";
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m29810a(((Number) obj).longValue());
        }
    }

    /* renamed from: a */
    public final long m29803a() {
        return 3600000L;
    }

    /* renamed from: b */
    public final long m29804b() {
        return System.currentTimeMillis() - 300000;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00ce. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:8:0x0064, B:10:0x006b, B:12:0x0079, B:13:0x0083, B:15:0x008b, B:17:0x0091, B:18:0x009b, B:20:0x00a5, B:21:0x00b1, B:23:0x00b9, B:27:0x00ce, B:40:0x013d, B:42:0x0145, B:45:0x0154, B:47:0x0169, B:48:0x0170, B:50:0x0178, B:51:0x0184, B:53:0x018c, B:55:0x0192, B:61:0x019e, B:62:0x01a5, B:64:0x01a9, B:66:0x01b1, B:68:0x01b7, B:72:0x01c0, B:29:0x00d2, B:30:0x00e1, B:31:0x00f0, B:32:0x00ff, B:33:0x010e, B:35:0x011e, B:37:0x0131, B:38:0x0137, B:73:0x01c3, B:75:0x01df, B:77:0x01e9, B:78:0x01f2, B:79:0x01fa), top: B:88:0x0064 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m29805c(Context context, long j, long j2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        String string;
        String string2;
        sq8.m48649h(context, "context");
        long jMax = Math.max(m29809g(), j);
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, Build.VERSION.SDK_INT >= 31 ? new String[]{"_id", "number", "type", "missed_reason", "date", "duration", "subscription_id", "phone_account_address", "last_modified"} : new String[]{"_id", "number", "type", "date", "duration", "subscription_id", "phone_account_address", "last_modified"}, "date BETWEEN ? AND ?", new String[]{String.valueOf(jMax), String.valueOf(j2)}, "last_modified DESC");
        if (cursorQuery != null) {
            while (true) {
                try {
                    Long lValueOf = null;
                    if (cursorQuery.moveToNext()) {
                        CallEvent.Builder builder = new CallEvent.Builder();
                        int columnIndex5 = cursorQuery.getColumnIndex("_id");
                        if (columnIndex5 > -1) {
                            String string3 = cursorQuery.getString(columnIndex5);
                            builder.callId(string3);
                            builder.phoneCallLogId(string3);
                        }
                        int columnIndex6 = cursorQuery.getColumnIndex("number");
                        if (columnIndex6 > -1 && (string2 = cursorQuery.getString(columnIndex6)) != null) {
                            sq8.m48646e(string2);
                            builder.number(e7d.m24492e(string2));
                        }
                        int columnIndex7 = cursorQuery.getColumnIndex("duration");
                        if (columnIndex7 > -1) {
                            builder.duration(Long.valueOf(cursorQuery.getLong(columnIndex7) * 1000));
                        }
                        int columnIndex8 = cursorQuery.getColumnIndex("type");
                        if (columnIndex8 > -1) {
                            int i = cursorQuery.getInt(columnIndex8);
                            builder.callType(String.valueOf(i));
                            if (i == 100) {
                                builder.direction(CallDirection.OUTGOING.name());
                                if (cursorQuery.getLong(columnIndex7) > 0) {
                                    builder.callConnectStatus(CallConnectStatus.CONNECTED);
                                    z = true;
                                    columnIndex = cursorQuery.getColumnIndex("date");
                                    if (columnIndex > -1) {
                                        builder.callStartTime(Long.valueOf(cursorQuery.getLong(columnIndex)));
                                    }
                                    if (columnIndex > -1 && columnIndex7 > -1) {
                                        long j3 = cursorQuery.getLong(columnIndex);
                                        builder.callEndTime(Long.valueOf(j3 + (cursorQuery.getLong(columnIndex7) * 1000)));
                                        if (z) {
                                            builder.callConnectTime(Long.valueOf(j3));
                                        }
                                    }
                                    columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                    if (columnIndex2 > -1) {
                                        builder.phoneHandle(new CallEvent.PhoneHandle(cursorQuery.getString(columnIndex2)));
                                    }
                                    columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                    if (columnIndex3 > -1) {
                                        String string4 = cursorQuery.getString(columnIndex3);
                                        if (!(string4 == null || string4.length() == 0)) {
                                            builder.phone(e7d.m24492e(string4));
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 31 && (columnIndex4 = cursorQuery.getColumnIndex("missed_reason")) > -1) {
                                        string = cursorQuery.getString(columnIndex4);
                                        if (!(string != null || string.length() == 0)) {
                                            builder.hangupReason(string);
                                        }
                                    }
                                } else {
                                    builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                    z = false;
                                    columnIndex = cursorQuery.getColumnIndex("date");
                                    if (columnIndex > -1) {
                                    }
                                    if (columnIndex > -1) {
                                        long j32 = cursorQuery.getLong(columnIndex);
                                        builder.callEndTime(Long.valueOf(j32 + (cursorQuery.getLong(columnIndex7) * 1000)));
                                        if (z) {
                                        }
                                    }
                                    columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                    if (columnIndex2 > -1) {
                                    }
                                    columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                    if (columnIndex3 > -1) {
                                    }
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        string = cursorQuery.getString(columnIndex4);
                                        if (string != null) {
                                            if (!(string != null || string.length() == 0)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i != 101) {
                                    switch (i) {
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        case 4:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        case 5:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        case 6:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        default:
                                            z = false;
                                            break;
                                    }
                                    columnIndex = cursorQuery.getColumnIndex("date");
                                    if (columnIndex > -1) {
                                    }
                                    if (columnIndex > -1) {
                                    }
                                    columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                    if (columnIndex2 > -1) {
                                    }
                                    columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                    if (columnIndex3 > -1) {
                                    }
                                    if (Build.VERSION.SDK_INT >= 31) {
                                    }
                                }
                                builder.direction(CallDirection.INCOMING.name());
                                builder.callConnectStatus(CallConnectStatus.CONNECTED);
                                z = true;
                                columnIndex = cursorQuery.getColumnIndex("date");
                                if (columnIndex > -1) {
                                }
                                if (columnIndex > -1) {
                                }
                                columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                if (columnIndex2 > -1) {
                                }
                                columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                if (columnIndex3 > -1) {
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                }
                            }
                        }
                        builder.context(context);
                        builder.callStatus("COMPLETED");
                        builder.isConnectedCall(Boolean.FALSE);
                        builder.source("CALL_LOG_SYNC");
                        CallEvent callEventBuild = builder.build();
                        Long callEndTime = callEventBuild.getCallEndTime();
                        if (callEndTime != null) {
                            long jLongValue = callEndTime.longValue();
                            Long callStartTime = callEventBuild.getCallStartTime();
                            if (callStartTime != null) {
                                lValueOf = Long.valueOf(jLongValue - callStartTime.longValue());
                            }
                        }
                        callEventBuild.setTotalCallDuration(lValueOf);
                        arrayList.add(callEventBuild);
                    } else {
                        y3i y3iVar = y3i.f54824a;
                        tb3.m49666a(cursorQuery, null);
                    }
                } finally {
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0116. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b1 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c0 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:12:0x00ad, B:14:0x00b4, B:16:0x00c2, B:17:0x00cc, B:19:0x00d4, B:21:0x00da, B:22:0x00e4, B:24:0x00ee, B:25:0x00fa, B:27:0x0102, B:31:0x0116, B:44:0x0185, B:46:0x018d, B:49:0x019c, B:51:0x01b1, B:52:0x01b8, B:54:0x01c0, B:55:0x01cc, B:57:0x01d4, B:59:0x01da, B:65:0x01e6, B:66:0x01ed, B:68:0x01f1, B:70:0x01f9, B:72:0x01ff, B:77:0x0209, B:33:0x011a, B:34:0x0129, B:35:0x0138, B:36:0x0147, B:37:0x0156, B:39:0x0166, B:41:0x0179, B:42:0x017f, B:78:0x020c, B:80:0x0228, B:82:0x0232, B:83:0x023b, B:84:0x0243), top: B:93:0x00ad }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m29806d(Context context, Set set) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        String string;
        String string2;
        sq8.m48649h(context, "context");
        sq8.m48649h(set, "callLogIds");
        ArrayList arrayList = new ArrayList();
        String[] strArr = Build.VERSION.SDK_INT >= 31 ? new String[]{"_id", "number", "type", "missed_reason", "date", "duration", "subscription_id", "phone_account_address", "last_modified"} : new String[]{"_id", "number", "type", "date", "duration", "subscription_id", "phone_account_address", "last_modified"};
        Set set2 = set;
        String str = "_id IN (" + kh3.p0(set2, ",", null, null, 0, null, C13848a.f26199a, 30, null) + ")";
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it.next()).longValue()));
        }
        Cursor cursorQuery = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, strArr, str, (String[]) arrayList2.toArray(new String[0]), "last_modified DESC");
        if (cursorQuery != null) {
            while (true) {
                try {
                    Long lValueOf = null;
                    if (cursorQuery.moveToNext()) {
                        CallEvent.Builder builder = new CallEvent.Builder();
                        int columnIndex5 = cursorQuery.getColumnIndex("_id");
                        if (columnIndex5 > -1) {
                            String string3 = cursorQuery.getString(columnIndex5);
                            builder.callId(string3);
                            builder.phoneCallLogId(string3);
                        }
                        int columnIndex6 = cursorQuery.getColumnIndex("number");
                        if (columnIndex6 > -1 && (string2 = cursorQuery.getString(columnIndex6)) != null) {
                            sq8.m48646e(string2);
                            builder.number(e7d.m24492e(string2));
                        }
                        int columnIndex7 = cursorQuery.getColumnIndex("duration");
                        if (columnIndex7 > -1) {
                            builder.duration(Long.valueOf(cursorQuery.getLong(columnIndex7) * 1000));
                        }
                        int columnIndex8 = cursorQuery.getColumnIndex("type");
                        if (columnIndex8 > -1) {
                            int i = cursorQuery.getInt(columnIndex8);
                            builder.callType(String.valueOf(i));
                            boolean z2 = true;
                            if (i == 100) {
                                builder.direction(CallDirection.OUTGOING.name());
                                if (cursorQuery.getLong(columnIndex7) > 0) {
                                    builder.callConnectStatus(CallConnectStatus.CONNECTED);
                                    z = true;
                                    columnIndex = cursorQuery.getColumnIndex("date");
                                    if (columnIndex > -1) {
                                        builder.callStartTime(Long.valueOf(cursorQuery.getLong(columnIndex)));
                                    }
                                    if (columnIndex > -1 && columnIndex7 > -1) {
                                        long j = cursorQuery.getLong(columnIndex);
                                        builder.callEndTime(Long.valueOf(j + (cursorQuery.getLong(columnIndex7) * 1000)));
                                        if (z) {
                                            builder.callConnectTime(Long.valueOf(j));
                                        }
                                    }
                                    columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                    if (columnIndex2 > -1) {
                                        builder.phoneHandle(new CallEvent.PhoneHandle(cursorQuery.getString(columnIndex2)));
                                    }
                                    columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                    if (columnIndex3 > -1) {
                                        String string4 = cursorQuery.getString(columnIndex3);
                                        if (!(string4 == null || string4.length() == 0)) {
                                            builder.phone(e7d.m24492e(string4));
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 31 && (columnIndex4 = cursorQuery.getColumnIndex("missed_reason")) > -1) {
                                        string = cursorQuery.getString(columnIndex4);
                                        if (string != null && string.length() != 0) {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            builder.hangupReason(string);
                                        }
                                    }
                                } else {
                                    builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                    z = false;
                                    columnIndex = cursorQuery.getColumnIndex("date");
                                    if (columnIndex > -1) {
                                    }
                                    if (columnIndex > -1) {
                                        long j2 = cursorQuery.getLong(columnIndex);
                                        builder.callEndTime(Long.valueOf(j2 + (cursorQuery.getLong(columnIndex7) * 1000)));
                                        if (z) {
                                        }
                                    }
                                    columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                    if (columnIndex2 > -1) {
                                    }
                                    columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                    if (columnIndex3 > -1) {
                                    }
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        string = cursorQuery.getString(columnIndex4);
                                        if (string != null) {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                        }
                                    }
                                }
                            } else {
                                if (i != 101) {
                                    switch (i) {
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        case 4:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        case 5:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        case 6:
                                            builder.direction(CallDirection.INCOMING.name());
                                            builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                            z = false;
                                            break;
                                        default:
                                            z = false;
                                            break;
                                    }
                                    columnIndex = cursorQuery.getColumnIndex("date");
                                    if (columnIndex > -1) {
                                    }
                                    if (columnIndex > -1) {
                                    }
                                    columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                    if (columnIndex2 > -1) {
                                    }
                                    columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                    if (columnIndex3 > -1) {
                                    }
                                    if (Build.VERSION.SDK_INT >= 31) {
                                    }
                                }
                                builder.direction(CallDirection.INCOMING.name());
                                builder.callConnectStatus(CallConnectStatus.CONNECTED);
                                z = true;
                                columnIndex = cursorQuery.getColumnIndex("date");
                                if (columnIndex > -1) {
                                }
                                if (columnIndex > -1) {
                                }
                                columnIndex2 = cursorQuery.getColumnIndex("subscription_id");
                                if (columnIndex2 > -1) {
                                }
                                columnIndex3 = cursorQuery.getColumnIndex("phone_account_address");
                                if (columnIndex3 > -1) {
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                }
                            }
                        }
                        builder.context(context);
                        builder.callStatus("COMPLETED");
                        builder.isConnectedCall(Boolean.FALSE);
                        builder.source("CALL_LOG_SYNC");
                        CallEvent callEventBuild = builder.build();
                        Long callEndTime = callEventBuild.getCallEndTime();
                        if (callEndTime != null) {
                            long jLongValue = callEndTime.longValue();
                            Long callStartTime = callEventBuild.getCallStartTime();
                            if (callStartTime != null) {
                                lValueOf = Long.valueOf(jLongValue - callStartTime.longValue());
                            }
                        }
                        callEventBuild.setTotalCallDuration(lValueOf);
                        arrayList.add(callEventBuild);
                    } else {
                        y3i y3iVar = y3i.f54824a;
                        tb3.m49666a(cursorQuery, null);
                    }
                } finally {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final rz1 m29807e(Context context, long j) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(context, "context");
        long j2 = 1000;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_data", "date_added", "date_modified", "mime_type", "relative_path"}, "date_added >= ?", new String[]{String.valueOf(j / j2)}, "date_added ASC");
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    rz1.C16681a c16681a = new rz1.C16681a();
                    c16681a.m47313b(context);
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    if (columnIndex > -1) {
                        String string = cursorQuery.getString(columnIndex);
                        sq8.m48648g(string, "getString(...)");
                        c16681a.m47318g(string);
                        c16681a.m47321j(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(string).build());
                    }
                    int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                    if (columnIndex2 > -1) {
                        String string2 = cursorQuery.getString(columnIndex2);
                        sq8.m48648g(string2, "getString(...)");
                        c16681a.m47316e(string2);
                    }
                    int columnIndex3 = cursorQuery.getColumnIndex("_data");
                    if (columnIndex3 > -1) {
                        String string3 = cursorQuery.getString(columnIndex3);
                        sq8.m48648g(string3, "getString(...)");
                        c16681a.m47317f(string3);
                    }
                    int columnIndex4 = cursorQuery.getColumnIndex("date_added");
                    if (columnIndex4 > -1) {
                        c16681a.m47314c(Long.valueOf(cursorQuery.getLong(columnIndex4) * j2));
                    }
                    int columnIndex5 = cursorQuery.getColumnIndex("date_modified");
                    if (columnIndex5 > -1) {
                        c16681a.m47315d(Long.valueOf(cursorQuery.getLong(columnIndex5) * j2));
                    }
                    int columnIndex6 = cursorQuery.getColumnIndex("mime_type");
                    if (columnIndex6 > -1) {
                        String string4 = cursorQuery.getString(columnIndex6);
                        sq8.m48648g(string4, "getString(...)");
                        c16681a.m47319h(string4);
                    }
                    int columnIndex7 = cursorQuery.getColumnIndex("relative_path");
                    if (columnIndex7 > -1) {
                        String string5 = cursorQuery.getString(columnIndex7);
                        sq8.m48648g(string5, "getString(...)");
                        c16681a.m47320i(string5);
                    }
                    rz1 rz1VarM47312a = c16681a.m47312a();
                    tb3.m49666a(cursorQuery, null);
                    return rz1VarM47312a;
                }
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(cursorQuery, null);
            } finally {
            }
        }
        return null;
    }

    /* renamed from: f */
    public final List m29808f(Context context, long j, long j2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(context, "context");
        long j3 = 1000;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_data", "date_added", "date_modified", "mime_type", "relative_path"}, "date_added >= ? and date_added <= ?", new String[]{String.valueOf(j / j3), String.valueOf(j2 / j3)}, "date_added DESC");
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    rz1.C16681a c16681a = new rz1.C16681a();
                    c16681a.m47313b(context);
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    if (columnIndex > -1) {
                        String string = cursorQuery.getString(columnIndex);
                        sq8.m48648g(string, "getString(...)");
                        c16681a.m47318g(string);
                        c16681a.m47321j(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(string).build());
                    }
                    int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                    if (columnIndex2 > -1) {
                        String string2 = cursorQuery.getString(columnIndex2);
                        sq8.m48648g(string2, "getString(...)");
                        c16681a.m47316e(string2);
                    }
                    int columnIndex3 = cursorQuery.getColumnIndex("_data");
                    if (columnIndex3 > -1) {
                        String string3 = cursorQuery.getString(columnIndex3);
                        sq8.m48648g(string3, "getString(...)");
                        c16681a.m47317f(string3);
                    }
                    int columnIndex4 = cursorQuery.getColumnIndex("date_added");
                    if (columnIndex4 > -1) {
                        c16681a.m47314c(Long.valueOf(cursorQuery.getLong(columnIndex4) * j3));
                    }
                    int columnIndex5 = cursorQuery.getColumnIndex("date_modified");
                    if (columnIndex5 > -1) {
                        c16681a.m47315d(Long.valueOf(cursorQuery.getLong(columnIndex5) * j3));
                    }
                    int columnIndex6 = cursorQuery.getColumnIndex("mime_type");
                    if (columnIndex6 > -1) {
                        String string4 = cursorQuery.getString(columnIndex6);
                        sq8.m48648g(string4, "getString(...)");
                        c16681a.m47319h(string4);
                    }
                    int columnIndex7 = cursorQuery.getColumnIndex("relative_path");
                    if (columnIndex7 > -1) {
                        String string5 = cursorQuery.getString(columnIndex7);
                        sq8.m48648g(string5, "getString(...)");
                        c16681a.m47320i(string5);
                    }
                    arrayList.add(c16681a.m47312a());
                } finally {
                }
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(cursorQuery, null);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final long m29809g() {
        return System.currentTimeMillis() - 259200000;
    }
}
