package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzem implements Runnable {
    final /* synthetic */ zzen zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzej zzd;
    private final String zze;
    private final Map zzf;

    public zzem(zzen zzenVar, String str, URL url, byte[] bArr, Map map, zzej zzejVar) {
        this.zza = zzenVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzejVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzejVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fc: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:253), block:B:42:0x00fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0102: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:259), block:B:44:0x00ff */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[Catch: all -> 0x00ef, LOOP:1: B:26:0x00c3->B:28:0x00c9, LOOP_END, TryCatch #4 {all -> 0x00ef, blocks: (B:25:0x00c1, B:26:0x00c3, B:28:0x00c9, B:29:0x00cd), top: B:77:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cd A[EDGE_INSN: B:93:0x00cd->B:29:0x00cd BREAK  A[LOOP:1: B:26:0x00c3->B:28:0x00c9], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e;
        int i2;
        Map map2;
        zzel zzelVar;
        zzfo zzfoVarZzaz;
        IOException iOException;
        zzen zzenVar;
        URLConnection uRLConnectionOpenConnection;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i3;
        this.zza.zzax();
        OutputStream outputStream = null;
        try {
            zzenVar = this.zza;
            uRLConnectionOpenConnection = this.zzb.openConnection();
        } catch (IOException e2) {
            e = e2;
            i2 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzenVar.zzt.zzf();
        httpURLConnection.setConnectTimeout(60000);
        zzenVar.zzt.zzf();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map map5 = this.zzf;
            if (map5 != null) {
                for (Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (this.zzc != null) {
                byte[] bArrZzy = this.zza.zzf.zzu().zzy(this.zzc);
                zzef zzefVarZzj = this.zza.zzt.zzay().zzj();
                int length = bArrZzy.length;
                zzefVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(bArrZzy);
                    outputStream2.close();
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e3) {
                    e = e3;
                    i2 = 0;
                    map2 = null;
                    outputStream = outputStream2;
                    iOException = e;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            this.zza.zzt.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeh.zzn(this.zze), e4);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzfoVarZzaz = this.zza.zzt.zzaz();
                    zzelVar = new zzel(this.zze, this.zzd, i2, iOException, null, map2, null);
                    zzfoVarZzaz.zzp(zzelVar);
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    map = null;
                    outputStream = outputStream2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            this.zza.zzt.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeh.zzn(this.zze), e5);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzt.zzaz().zzp(new zzel(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                bArr = new byte[1024];
                                while (true) {
                                    i3 = inputStream.read(bArr);
                                    if (i3 > 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i3);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzfoVarZzaz = this.zza.zzt.zzaz();
                                zzelVar = new zzel(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null);
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                    } catch (IOException e6) {
                        map2 = null;
                        iOException = e6;
                        i2 = responseCode;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        zzfoVarZzaz = this.zza.zzt.zzaz();
                        zzelVar = new zzel(this.zze, this.zzd, i2, iOException, null, map2, null);
                        zzfoVarZzaz.zzp(zzelVar);
                    } catch (Throwable th6) {
                        th = th6;
                        map = null;
                        i = responseCode;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzt.zzaz().zzp(new zzel(this.zze, this.zzd, i, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    i2 = responseCode;
                    map2 = map4;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzfoVarZzaz = this.zza.zzt.zzaz();
                    zzelVar = new zzel(this.zze, this.zzd, i2, iOException, null, map2, null);
                    zzfoVarZzaz.zzp(zzelVar);
                } catch (Throwable th7) {
                    th = th7;
                    i = responseCode;
                    map = map3;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzt.zzaz().zzp(new zzel(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
            } else {
                responseCode = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                byteArrayOutputStream = new ByteArrayOutputStream();
                inputStream = httpURLConnection.getInputStream();
                bArr = new byte[1024];
                while (true) {
                    i3 = inputStream.read(bArr);
                    if (i3 > 0) {
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                inputStream.close();
                httpURLConnection.disconnect();
                zzfoVarZzaz = this.zza.zzt.zzaz();
                zzelVar = new zzel(this.zze, this.zzd, responseCode, null, byteArray2, headerFields2, null);
            }
        } catch (IOException e8) {
            i2 = 0;
            map2 = null;
            iOException = e8;
        } catch (Throwable th8) {
            i = 0;
            map = null;
            th = th8;
        }
        zzfoVarZzaz.zzp(zzelVar);
    }
}
