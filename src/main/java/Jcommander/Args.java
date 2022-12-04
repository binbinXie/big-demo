package Jcommander;

import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author blise
 * @version 1.0.0
 * @since 2022/12/01 10:00
 * 使用选项描述注释字段
 */
public class Args {
  @Parameter
  private List<String> parameters = new ArrayList<>();

}
