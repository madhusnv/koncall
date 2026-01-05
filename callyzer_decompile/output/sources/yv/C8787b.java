package yv;

import a2.AbstractC0030c;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import org.bouncycastle.asn1.x509.DisplayText;
import pg.g9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.b */
/* loaded from: classes3.dex */
public final class C8787b {

    /* renamed from: a */
    public static final String[] f42451a = {"lava", "infinix", "itel"};

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m16150a(Context context, String str, String str2, String tag, Uri uri, C8805t traceLogs, int i10) throws IOException, IllegalArgumentException {
        boolean z6;
        long jM16152c;
        long jM16152c2;
        String str3 = (i10 & 2) != 0 ? null : str;
        Uri uri2 = (i10 & 16) != 0 ? null : uri;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        if ((str3 == null || str3.length() == 0) && uri2 == null) {
            traceLogs.m16232g(tag, "ComparingDuration >>> please provide source path or source uri");
            return false;
        }
        if (str2.length() == 0) {
            traceLogs.m16232g(tag, "ComparingDuration >>> compress path is not provided");
            return false;
        }
        try {
            if (uri2 != null) {
                jM16152c = m16152c(context, uri2);
            } else {
                jM16152c = m16152c(context, str3 != null ? g9.m11661a(context, str3) : null);
            }
            if (AbstractC5178p.m10116x(str2, "data/" + context.getPackageName(), false)) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str2);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                jM16152c2 = (strExtractMetadata == null || strExtractMetadata.length() == 0) ? -1L : Long.parseLong(strExtractMetadata);
            } else {
                jM16152c2 = m16152c(context, g9.m11661a(context, str2));
            }
            try {
                if (jM16152c < 0 || jM16152c2 < 0) {
                    traceLogs.m16232g(tag, "ComparingDuration >>> Uri do not have read permission, skipping check");
                    return true;
                }
                long j6 = jM16152c;
                long j10 = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
                long j11 = jM16152c2 - j10;
                if (j6 <= j10 + jM16152c2 && j11 <= j6) {
                    return true;
                }
                traceLogs.m16232g(tag, "ComparingDuration >>> failed , durations " + str3 + "/" + uri2 + "=" + j6 + " and " + str2 + "=" + jM16152c2 + " not matched");
                return false;
            } catch (Exception e10) {
                e = e10;
                z6 = str;
                StringBuilder sbM127r = AbstractC0030c.m127r("ComparingDuration >>> Exception: ", e.getMessage(), " for sourcePath = ", str3, " or ");
                sbM127r.append(uri2);
                sbM127r.append(" and compressPath = ");
                sbM127r.append(str2);
                traceLogs.m16232g(tag, sbM127r.toString());
                traceLogs.m16237l(tag + " >>> ComparingDuration >>> Exception: " + e.getMessage());
                return z6;
            }
        } catch (Exception e11) {
            e = e11;
            z6 = 0;
            StringBuilder sbM127r2 = AbstractC0030c.m127r("ComparingDuration >>> Exception: ", e.getMessage(), " for sourcePath = ", str3, " or ");
            sbM127r2.append(uri2);
            sbM127r2.append(" and compressPath = ");
            sbM127r2.append(str2);
            traceLogs.m16232g(tag, sbM127r2.toString());
            traceLogs.m16237l(tag + " >>> ComparingDuration >>> Exception: " + e.getMessage());
            return z6;
        }
    }

    /* renamed from: b */
    public static Uri m16151b(String folderPath, String str) throws Exception {
        AbstractC4154l.m8923f(folderPath, "folderPath");
        try {
            Uri uri = Uri.parse(folderPath);
            List listM10112W = AbstractC5178p.m10112W(str, new String[]{"/document/"}, 6);
            if (listM10112W.size() <= 1) {
                throw new Exception("/document/ not found");
            }
            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, (String) listM10112W.get(1));
            AbstractC4154l.m8922e(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
            return uriBuildDocumentUriUsingTree;
        } catch (Exception e2) {
            throw new Exception(AbstractC0030c.m121l("failed to convert ", str, " to content Uri >>> ", e2.getMessage()));
        }
    }

    /* renamed from: c */
    public static long m16152c(Context context, Uri uri) throws SecurityException, IOException, IllegalArgumentException {
        AbstractC4154l.m8923f(context, "context");
        Boolean boolValueOf = uri != null ? Boolean.valueOf(g9.m11663c(context, uri)) : null;
        if (uri == null || AbstractC4154l.m8918a(boolValueOf, Boolean.FALSE)) {
            return -1L;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (strExtractMetadata == null || strExtractMetadata.length() == 0) {
            return -1L;
        }
        return Long.parseLong(strExtractMetadata);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri m16153d(android.content.Context r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.C8787b.m16153d(android.content.Context, java.lang.String):android.net.Uri");
    }
}
