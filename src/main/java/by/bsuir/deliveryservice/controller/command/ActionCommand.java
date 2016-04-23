package by.bsuir.deliveryservice.controller.command;

import javax.servlet.http.HttpServletRequest;

/**
 * Class {@code ActionCommand} is an interface representing a command, handled by a servlet
 */
public interface ActionCommand {
    /**
     * Performs necessary actions, retrieves information from the service layers and sets
     * it to the request if necessary.
     * @param request request from the servlet
     * @return path to the page to forward request to
     * @throws CommandException
     */
    String execute(HttpServletRequest request) throws CommandException;
}
