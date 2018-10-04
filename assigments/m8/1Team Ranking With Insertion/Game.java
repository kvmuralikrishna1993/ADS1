/**
 * Class for game.
 */
class Game implements Comparable<Game>{
    /**
     * { var_country }.
     */
    private String name;
    /**
     * { var_win }.
     */
    private String win;
    /**
     * { var_loss }.
     */
    private String loss;
    /**
     * { var_draw}.
     */
    private String draw;
    /**
     * Constructs the object.
     *
     * @param      name  The name
     * @param      win   The window
     * @param      loss  The loss
     * @param      draw  The draw
     */
    Game(final String name, final String win, final String loss, final String draw) {
        this.name = name;
        this.win = win;
        this.loss = loss;
        this.draw = draw;
    }
    /**
     * { get_name}.
     *
     * @return     { name}.
     */
    public String toString() {
        return this.name;
    }
    /**
     * { get_win}.
     *
     * @return     { win }.
     */
    String getwin() {
        return this.win;
    }
    /**
     * { get_loss}.
     *
     * @return     { loss }.
     */
    String getloss() {
        return this.loss;
    }
    /**
     * { get_draw }.
     *
     * @return     { draw }.
     */
    String getdraw() {
        return this.draw;
    }
    /**
     * { function_compareT0 }.
     *
     * @param      that  The that
     *
     * @return     { 1 or -1 or 0 }.
     */
    public int compareTo(Game that) {
        if (Integer.parseInt(this.getwin()) > Integer.parseInt(that.getwin())) {
            return -1;
        } else if (Integer.parseInt(this.getwin()) < Integer.parseInt(that.getwin())) {
            return 1;
        } else if (Integer.parseInt(this.getloss()) > Integer.parseInt(that.getloss())) {
            return 1;
        } else if (Integer.parseInt(this.getloss()) < Integer.parseInt(that.getloss())){
            return -1;
        } else if (Integer.parseInt(this.getdraw()) > Integer.parseInt(that.getdraw())){
            return -1;
        } else if (Integer.parseInt(this.getdraw()) < Integer.parseInt(that.getdraw())) {
            return 1;
        } else {
            return 0;
        }
    }
}
