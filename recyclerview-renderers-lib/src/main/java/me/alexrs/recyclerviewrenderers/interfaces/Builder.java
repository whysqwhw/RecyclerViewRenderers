package me.alexrs.recyclerviewrenderers.interfaces;

import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public interface Builder {

    /**
     * @param id the ID of the layout
     * @return an instance of the builder
     */
    Builder instantiate(int id);

    /**
     * @return the Benderer assigned to the layout
     */
    Renderer create();

}