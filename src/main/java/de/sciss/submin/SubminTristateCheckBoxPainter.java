package de.sciss.submin;

import com.alee.extended.checkbox.ITristateCheckBoxPainter;
import com.alee.extended.checkbox.WebTristateCheckBox;
import com.alee.extended.checkbox.WebTristateCheckBoxUI;
import com.alee.laf.checkbox.CheckState;
import com.alee.painter.decoration.DecorationState;
import com.alee.painter.decoration.IDecoration;
import de.sciss.submin.AbstractStateButtonPainter;

import java.util.List;

/**
 * The Submin version simply inherits from a different `AbstractButtonPainter` trait.
 * With Scala we could have better composition, I guess...
 *
 * @author Alexandr Zernov
 */

public class SubminTristateCheckBoxPainter<E extends WebTristateCheckBox, U extends WebTristateCheckBoxUI, D extends IDecoration<E, D>>
        extends AbstractStateButtonPainter<E, U, D> implements ITristateCheckBoxPainter<E, U>
{
    @Override
    protected List<String> getDecorationStates ()
    {
        final List<String> states = super.getDecorationStates ();
        if ( component.getState () == CheckState.checked )
        {
            states.add ( DecorationState.checked );
        }
        if ( component.getState () == CheckState.mixed )
        {
            states.add ( DecorationState.mixed );
        }
        return states;
    }
}