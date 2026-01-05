package com.google.android.gms.internal.cast;

import com.google.firebase.perf.util.Constants;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
final class zzrr extends zzru {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzrr(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzb(byte b) throws zzrs {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzrs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzrs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzd(int i, boolean z) throws zzrs {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zze(int i, zzrm zzrmVar) throws zzrs {
        zzq((i << 3) | 2);
        zzq(zzrmVar.zzd());
        zzrmVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzf(int i, int i2) throws zzrs {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzg(int i) throws zzrs {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & Constants.MAX_HOST_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
            this.zze = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH);
        } catch (IndexOutOfBoundsException e) {
            throw new zzrs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzh(int i, long j) throws zzrs {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzi(long j) throws zzrs {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & Constants.MAX_HOST_LENGTH);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & Constants.MAX_HOST_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & Constants.MAX_HOST_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & Constants.MAX_HOST_LENGTH);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & Constants.MAX_HOST_LENGTH);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & Constants.MAX_HOST_LENGTH);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & Constants.MAX_HOST_LENGTH);
            this.zze = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & Constants.MAX_HOST_LENGTH);
        } catch (IndexOutOfBoundsException e) {
            throw new zzrs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzj(int i, int i2) throws zzrs {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzk(int i) throws zzrs {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzm(int i, String str) throws zzrs {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws zzrs {
        int i = this.zze;
        try {
            int iZzx = zzru.zzx(str.length() * 3);
            int iZzx2 = zzru.zzx(str.length());
            if (iZzx2 != iZzx) {
                zzq(zzvf.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzvf.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzx2;
            this.zze = i3;
            int iZzb = zzvf.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzq((iZzb - i) - iZzx2);
            this.zze = iZzb;
        } catch (zzve e) {
            this.zze = i;
            zzB(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzrs(e2);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzo(int i, int i2) throws zzrs {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzp(int i, int i2) throws zzrs {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzq(int i) throws zzrs {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = i2 + 1;
                bArr[i2] = (byte) ((i & Opcodes.LAND) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzrs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i3 = this.zze;
        this.zze = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzr(int i, long j) throws zzrs {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.cast.zzru
    public final void zzs(long j) throws zzrs {
        if (zzru.zzd && this.zzd - this.zze >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i = this.zze;
                this.zze = i + 1;
                zzvb.zzn(bArr, i, (byte) ((((int) j) & Opcodes.LAND) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            zzvb.zzn(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & Opcodes.LAND) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzrs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr4 = this.zzc;
        int i4 = this.zze;
        this.zze = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
