package com.amplifyframework.core.model.temporal;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import j$.time.OffsetTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class Temporal {

    public static final class Date implements Comparable<Date>, Serializable {
        private static final long serialVersionUID = 1;
        private final LocalDate localDate;
        private final ZoneOffset zoneOffset;

        public Date(java.util.Date date) {
            this.zoneOffset = null;
            this.localDate = Instant.ofEpochMilli(date.getTime()).atOffset(ZoneOffset.UTC).toLocalDate();
        }

        private DateTimeFormatter getOffsetDateTimeFormatter() {
            return new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_OFFSET_DATE).parseDefaulting(ChronoField.HOUR_OF_DAY, 0L).parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0L).toFormatter();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Date.class != obj.getClass()) {
                return false;
            }
            Date date = (Date) obj;
            return s6c.m47909a(this.localDate, date.localDate) && s6c.m47909a(this.zoneOffset, date.zoneOffset);
        }

        public String format() {
            ZoneOffset zoneOffset = this.zoneOffset;
            if (zoneOffset == null) {
                return DateTimeFormatter.ISO_LOCAL_DATE.format(this.localDate);
            }
            return getOffsetDateTimeFormatter().format(OffsetDateTime.of(this.localDate, LocalTime.MIDNIGHT, zoneOffset));
        }

        public int getOffsetTotalSeconds() {
            ZoneOffset zoneOffset = this.zoneOffset;
            if (zoneOffset != null) {
                return zoneOffset.getTotalSeconds();
            }
            throw new IllegalStateException("Temporal.Date instance does not have a timezone offset.");
        }

        public int hashCode() {
            int iHashCode = this.localDate.hashCode() * 31;
            ZoneOffset zoneOffset = this.zoneOffset;
            return iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0);
        }

        public java.util.Date toDate() {
            ZoneOffset zoneOffset = this.zoneOffset;
            if (zoneOffset == null) {
                zoneOffset = ZoneOffset.UTC;
            }
            return new java.util.Date(OffsetDateTime.of(this.localDate, LocalTime.MIDNIGHT, zoneOffset).toInstant().toEpochMilli());
        }

        public String toString() {
            return "Temporal.Date{localDate='" + this.localDate + "', zoneOffset='" + this.zoneOffset + "'}";
        }

        @Override // java.lang.Comparable
        public int compareTo(Date date) {
            Objects.requireNonNull(date);
            return toDate().compareTo(date.toDate());
        }

        public Date(java.util.Date date, int i) {
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i);
            this.zoneOffset = zoneOffsetOfTotalSeconds;
            this.localDate = Instant.ofEpochMilli(date.getTime()).atOffset(zoneOffsetOfTotalSeconds).toLocalDate();
        }

        public Date(String str) {
            LocalDate localDateFrom;
            ZoneOffset zoneOffsetFrom;
            try {
                OffsetDateTime offsetDateTime = OffsetDateTime.parse(str, getOffsetDateTimeFormatter());
                localDateFrom = LocalDate.from(offsetDateTime);
                zoneOffsetFrom = ZoneOffset.from((TemporalAccessor) offsetDateTime);
            } catch (Exception e) {
                try {
                    localDateFrom = LocalDate.parse(str, DateTimeFormatter.ISO_LOCAL_DATE);
                    zoneOffsetFrom = null;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Failed to create Temporal.Date object from " + str, e);
                }
            }
            this.localDate = localDateFrom;
            this.zoneOffset = zoneOffsetFrom;
        }
    }

    public static final class DateTime implements Comparable<DateTime>, Serializable {
        private static final long serialVersionUID = 1;
        private final OffsetDateTime offsetDateTime;

        public DateTime(java.util.Date date, int i) {
            this.offsetDateTime = Instant.ofEpochMilli(date.getTime()).atOffset(ZoneOffset.ofTotalSeconds(i));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || DateTime.class != obj.getClass()) {
                return false;
            }
            return s6c.m47909a(this.offsetDateTime, ((DateTime) obj).offsetDateTime);
        }

        public String format() {
            return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.offsetDateTime);
        }

        public int getOffsetTotalSeconds() {
            return this.offsetDateTime.getOffset().getTotalSeconds();
        }

        public int hashCode() {
            return this.offsetDateTime.hashCode();
        }

        public java.util.Date toDate() {
            return new java.util.Date(this.offsetDateTime.toInstant().toEpochMilli());
        }

        public String toString() {
            return "Temporal.DateTime{offsetDateTime='" + this.offsetDateTime + "'}";
        }

        @Override // java.lang.Comparable
        public int compareTo(DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            return toDate().compareTo(dateTime.toDate());
        }

        public DateTime(String str) {
            try {
                this.offsetDateTime = OffsetDateTime.parse(str, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to create Temporal.DateTime object from " + str, e);
            }
        }
    }

    public static final class Time implements Comparable<Time>, Serializable {
        private static final long serialVersionUID = 1;
        private final LocalTime localTime;
        private final ZoneOffset zoneOffset;

        public Time(java.util.Date date) {
            this.zoneOffset = null;
            this.localTime = Instant.ofEpochMilli(date.getTime()).atOffset(ZoneOffset.UTC).toLocalTime();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Time.class != obj.getClass()) {
                return false;
            }
            Time time = (Time) obj;
            return s6c.m47909a(this.localTime, time.localTime) && s6c.m47909a(this.zoneOffset, time.zoneOffset);
        }

        public String format() {
            ZoneOffset zoneOffset = this.zoneOffset;
            if (zoneOffset == null) {
                return DateTimeFormatter.ISO_LOCAL_TIME.format(this.localTime);
            }
            return DateTimeFormatter.ISO_OFFSET_TIME.format(OffsetTime.of(this.localTime, zoneOffset));
        }

        public int getOffsetTotalSeconds() {
            ZoneOffset zoneOffset = this.zoneOffset;
            if (zoneOffset != null) {
                return zoneOffset.getTotalSeconds();
            }
            throw new IllegalStateException("Temporal.Time instance does not have a timezone offset.");
        }

        public int hashCode() {
            int iHashCode = this.localTime.hashCode() * 31;
            ZoneOffset zoneOffset = this.zoneOffset;
            return iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0);
        }

        public java.util.Date toDate() {
            ZoneOffset zoneOffset = this.zoneOffset;
            if (zoneOffset == null) {
                zoneOffset = ZoneOffset.UTC;
            }
            return new java.util.Date(OffsetDateTime.of(LocalDate.ofEpochDay(0L), this.localTime, zoneOffset).toInstant().toEpochMilli());
        }

        public String toString() {
            return "Temporal.Time{localTime='" + this.localTime + "', zoneOffset='" + this.zoneOffset + "'}";
        }

        @Override // java.lang.Comparable
        public int compareTo(Time time) {
            Objects.requireNonNull(time);
            return toDate().compareTo(time.toDate());
        }

        public Time(java.util.Date date, int i) {
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i);
            this.zoneOffset = zoneOffsetOfTotalSeconds;
            this.localTime = Instant.ofEpochMilli(date.getTime()).atOffset(zoneOffsetOfTotalSeconds).toLocalTime();
        }

        public Time(String str) {
            LocalTime localTimeFrom;
            ZoneOffset zoneOffsetFrom;
            try {
                OffsetTime offsetTime = OffsetTime.parse(str, DateTimeFormatter.ISO_OFFSET_TIME);
                localTimeFrom = LocalTime.from(offsetTime);
                zoneOffsetFrom = ZoneOffset.from((TemporalAccessor) offsetTime);
            } catch (Exception e) {
                try {
                    localTimeFrom = LocalTime.parse(str, DateTimeFormatter.ISO_LOCAL_TIME);
                    zoneOffsetFrom = null;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Failed to create Temporal.Time object from " + str, e);
                }
            }
            this.localTime = localTimeFrom;
            this.zoneOffset = zoneOffsetFrom;
        }
    }

    public static final class Timestamp implements Comparable<Timestamp>, Serializable {
        private static final long serialVersionUID = 1;
        private final long secondsSinceEpoch;

        public Timestamp() {
            this(new java.util.Date());
        }

        public static Timestamp now() {
            return new Timestamp();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && Timestamp.class == obj.getClass() && this.secondsSinceEpoch == ((Timestamp) obj).secondsSinceEpoch;
        }

        public long getSecondsSinceEpoch() {
            return this.secondsSinceEpoch;
        }

        public int hashCode() {
            long j = this.secondsSinceEpoch;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "Temporal.Timestamp{timestamp=" + this.secondsSinceEpoch + '}';
        }

        public Timestamp(long j, TimeUnit timeUnit) {
            this.secondsSinceEpoch = timeUnit.toSeconds(j);
        }

        @Override // java.lang.Comparable
        public int compareTo(Timestamp timestamp) {
            Objects.requireNonNull(timestamp);
            return Long.compare(getSecondsSinceEpoch(), timestamp.getSecondsSinceEpoch());
        }

        public Timestamp(java.util.Date date) {
            this(date.getTime(), TimeUnit.MILLISECONDS);
        }
    }

    private Temporal() {
    }
}
