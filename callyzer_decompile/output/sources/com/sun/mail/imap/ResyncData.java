package com.sun.mail.imap;

import com.sun.mail.imap.protocol.UIDSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ResyncData {
    public static final ResyncData CONDSTORE = new ResyncData(-1, -1);
    private long modseq;
    private UIDSet[] uids;
    private long uidvalidity;

    public ResyncData(long j6, long j10) {
        this.uidvalidity = j6;
        this.modseq = j10;
        this.uids = null;
    }

    public long getModSeq() {
        return this.modseq;
    }

    public UIDSet[] getUIDSet() {
        return this.uids;
    }

    public long getUIDValidity() {
        return this.uidvalidity;
    }

    public ResyncData(long j6, long j10, long j11, long j12) {
        this.uids = null;
        this.uidvalidity = j6;
        this.modseq = j10;
        this.uids = new UIDSet[]{new UIDSet(j11, j12)};
    }

    public ResyncData(long j6, long j10, long[] jArr) {
        this.uids = null;
        this.uidvalidity = j6;
        this.modseq = j10;
        this.uids = UIDSet.createUIDSets(jArr);
    }
}
