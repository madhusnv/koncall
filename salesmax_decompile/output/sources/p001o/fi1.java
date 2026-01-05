package p001o;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class fi1 implements loe {

    /* renamed from: b */
    public static final mec f23357b = mec.m38833f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final mec f23358c = mec.m38832e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    public final wo0 f23359a;

    public fi1(wo0 wo0Var) {
        this.f23359a = wo0Var;
    }

    @Override // p001o.loe
    /* renamed from: a */
    public a76 mo21293a(rec recVar) {
        return a76.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #2 {all -> 0x00b2, blocks: (B:3:0x0021, B:12:0x004b, B:25:0x0063, B:27:0x0069, B:31:0x00ae, B:32:0x00b1, B:22:0x005e), top: B:42:0x0021 }] */
    @Override // p001o.i76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo19552b(zne zneVar, File file, rec recVar) {
        boolean z;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) zneVar.get();
        Bitmap.CompressFormat compressFormatM26712d = m26712d(bitmap, recVar);
        et7.m25574d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatM26712d);
        try {
            long jM37350b = lja.m37350b();
            int iIntValue = ((Integer) recVar.m46585c(f23357b)).intValue();
            OutputStream fm1Var = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fm1Var = this.f23359a != null ? new fm1(fileOutputStream, this.f23359a) : fileOutputStream;
                bitmap.compress(compressFormatM26712d, iIntValue, fm1Var);
                fm1Var.close();
                try {
                    fm1Var.close();
                } catch (IOException unused2) {
                }
                z = true;
            } catch (IOException unused3) {
                fm1Var = fileOutputStream;
                Log.isLoggable("BitmapEncoder", 3);
                if (fm1Var != null) {
                    try {
                        fm1Var.close();
                    } catch (IOException unused4) {
                    }
                }
                z = false;
                if (Log.isLoggable("BitmapEncoder", 2)) {
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                fm1Var = fileOutputStream;
                if (fm1Var != null) {
                    try {
                        fm1Var.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Compressed with type: ");
                sb.append(compressFormatM26712d);
                sb.append(" of size ");
                sb.append(uqi.m51926g(bitmap));
                sb.append(" in ");
                sb.append(lja.m37349a(jM37350b));
                sb.append(", options format: ");
                sb.append(recVar.m46585c(f23358c));
                sb.append(", hasAlpha: ");
                sb.append(bitmap.hasAlpha());
            }
            return z;
        } finally {
            et7.m25575e();
        }
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat m26712d(Bitmap bitmap, rec recVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) recVar.m46585c(f23358c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
