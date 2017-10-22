package bzha2709.comp5216.au.edu.sydney.bpmon.backend.fromFront;

/**
 * Created by Bingqing ZHAO on 2017/9/25
 */

public class Measure
{
    private Long id;
    private Long time;
    private short dia;
    private short sys;
    private short pulse;
    private short position;
    private short arm;
    private short mood;

    public Measure() {}


    public Measure(Long id, Long time, short dia, short sys, short pulse,
            short position, short arm, short mood) {
        this.id = id;
        this.time = time;
        this.dia = dia;
        this.sys = sys;
        this.pulse = pulse;
        this.position = position;
        this.arm = arm;
        this.mood = mood;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public short getDia() {
        return this.dia;
    }

    public void setDia(short dia) {
        this.dia = dia;
    }

    public short getSys() {
        return this.sys;
    }

    public void setSys(short sys) {
        this.sys = sys;
    }

    public short getPulse() {
        return this.pulse;
    }

    public void setPulse(short pulse) {
        this.pulse = pulse;
    }

    public short getPosition() {
        return this.position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public short getArm() {
        return this.arm;
    }

    public void setArm(short arm) {
        this.arm = arm;
    }

    public short getMood() {
        return this.mood;
    }

    public void setMood(short mood) {
        this.mood = mood;
    }

}
