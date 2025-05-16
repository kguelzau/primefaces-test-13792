/* Place any Javascript here you want loaded in test.xhtml */

/* workaround
PrimeFaces.widget.Galleria = PrimeFaces.widget.Galleria.extend({
    show: function (index) {
        // disable animation because "onEntering" is not called reliable
        let state = PrimeFaces.animationEnabled;
        PrimeFaces.animationEnabled = false;
        this._super(index);
        PrimeFaces.animationEnabled = state;
    }
});
*/
