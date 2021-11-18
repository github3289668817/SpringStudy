package per.xgt.mapper;

import per.xgt.domain.Order;

import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/18 13:51
 */
public interface OrderMapper {

    public List<Order> findAll();

}
