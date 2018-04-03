<%--
  Created by IntelliJ IDEA.
  User: 14571
  Date: 2018/3/31
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-clearmin.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/roboto.css">
    <link rel="stylesheet" type="text/css" href="assets/css/material-design.css">
    <link rel="stylesheet" type="text/css" href="assets/css/small-n-flat.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/thtd.css">

</head>
<body class="cm-no-transition cm-1-navbar">
<div id="cm-menu">
    <nav class="cm-navbar cm-navbar-primary">
        <div class="cm-flex"><a href="index.html">
            <font color="white"  style="font-weight: bold;font-style: italic; font-size:30px;">&emsp;&emsp;&emsp;懒哎</font>
        </a></div>
        <div class="btn btn-primary md-menu-white" data-toggle="cm-menu"></div>
    </nav>
    <div id="cm-menu-content">
        <div id="cm-menu-items-wrapper">
            <div id="cm-menu-scroller">
                <ul class="cm-menu-items">
                    <li class="active"><a href="/admin/list" class="sf-profile">管理员</a></li>
                    <li><a href="/admin/ulist" class="sf-profile-group">用户管理</a></li>
                    <li><a href="type.html" class="sf-layers">类型管理</a></li>
                    <li><a href="login.html" class="sf-lock-open">Login page</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<header id="cm-header">
    <nav class="cm-navbar cm-navbar-primary">
        <div class="btn btn-primary md-menu-white hidden-md hidden-lg" data-toggle="cm-menu"></div>
        <div class="cm-flex">
            <h1>后台</h1>
            <form id="cm-search" action="index.html" method="get">
                <input type="search" name="q" autocomplete="off" placeholder="Search...">
            </form>
        </div>
        <div class="pull-right">
            <div id="cm-search-btn" class="btn btn-primary md-search-white" data-toggle="cm-search"></div>
        </div>
        <div class="dropdown pull-right">
            <button class="btn btn-primary md-notifications-white" data-toggle="dropdown"> <span class="label label-danger">23</span> </button>
            <div class="popover cm-popover bottom">
                <div class="arrow"></div>
                <div class="popover-content">
                    <div class="list-group">
                        <a href="#" class="list-group-item">
                            <h4 class="list-group-item-heading text-overflow">
                                <i class="fa fa-fw fa-envelope"></i> Nunc volutpat aliquet magna.
                            </h4>
                            <p class="list-group-item-text text-overflow">Pellentesque tincidunt mollis scelerisque. Praesent vel blandit quam.</p>
                        </a>
                        <a href="#" class="list-group-item">
                            <h4 class="list-group-item-heading">
                                <i class="fa fa-fw fa-envelope"></i> Aliquam orci lectus
                            </h4>
                            <p class="list-group-item-text">Donec quis arcu non risus sagittis</p>
                        </a>
                        <a href="#" class="list-group-item">
                            <h4 class="list-group-item-heading">
                                <i class="fa fa-fw fa-warning"></i> Holy guacamole !
                            </h4>
                            <p class="list-group-item-text">Best check yo self, you're not looking too good.</p>
                        </a>
                    </div>
                    <div style="padding:10px"><a class="btn btn-success btn-block" href="#">Show me more...</a></div>
                </div>
            </div>
        </div>
        <div class="dropdown pull-right">
            <button class="btn btn-primary md-account-circle-white" data-toggle="dropdown"></button>
            <ul class="dropdown-menu">
                <li class="disabled text-center">
                    <a style="cursor:default;"><strong>管理员</strong></a>
                </li>
                <li class="divider"></li>

                <li>
                    <a href="login.html"><i class="fa fa-fw fa-sign-out"></i>登出</a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<div id="global">
    <div class="container-fluid">
        <!--body2-->

        <div class="panel panel-default">
            <div class="panel-heading">用户</div>
            <div class="panel-body" id="demo-buttons">
                <div class="row">
                    <!--模糊查询-->

                    <form action="/admin/ulist" method="post">
                        <div style="width: 400px; float: right; margin-bottom: 20px;" class="input-group">
                            <input type="text" name="uname" class="form-control" placeholder="输入用户名">
                            <span class="input-group-btn">
                                <button class="btn btn-primary" type="submit">搜索</button>
                            </span>
                        </div>
                    </form>
                    <!--表-->
                    <div class="panel-body">
                        <table class="table table-bordered table-hover" id="userTable">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>用户名</th>
                                <th>性别</th>
                                <th>电话</th>
                                <th>邮箱</th>
                                <th>操作</th>
                            </tr>
                            </thead>

                            <c:forEach items="${uList}" var="u" varStatus="i">
                            <tbody>
                            <tr>
                                <th scope="row">${i.count}</th>
                                <td>${u.username}</td>
                                <td>${u.gender}</td>
                                <td>${u.phone}</td>
                                <td>${u.email}</td>
                                <td>
                                    <button type="button" class="btn btn-danger">删除</button>
                                    <button type="button" class="btn btn-info">修改</button>
                                </td>
                            </tr>
                            </c:forEach>

                            </tbody>
                        </table>
                        <!--分页-->
                        <nav style="float: right">
                            <ul class="pagination shadowed" style="margin:0">
                                <c:if test="${pageDTO.currPage==1}">
                                    <li>
                                        <a>
                                            <span><i class="fa fa-angle-left"></i></span>
                                        </a>
                                    </li>
                                </c:if>
                                <c:if test="${pageDTO.currPage>1}">
                                    <li>
                                        <a href="/admin/ulist?currPage=${pageDTO.currPage-1}">
                                            <span><i class="fa fa-angle-left"></i></span>
                                        </a>
                                    </li>
                                </c:if>
                                <%--循环>总页数--%>
                                <c:forEach begin="1" end="${pageDTO.maxPage}" var="b">
                                    <c:if test="${b==pageDTO.currPage}">
                                        <li class="active"><a href="/admin/ulist?currPage=${b}">${b}</a></li>
                                    </c:if>
                                    <c:if test="${b!=pageDTO.currPage}">
                                        <li><a href="/admin/ulist?currPage=${b}">${b}</a></li>
                                    </c:if>
                                </c:forEach>
                                <c:if test="${pageDTO.currPage==pageDTO.maxPage}">
                                    <li>
                                        <a>
                                            <span><i class="fa fa-angle-right"></i></span>
                                        </a>
                                    </li>
                                </c:if>
                                <c:if test="${pageDTO.currPage<pageDTO.maxPage}">
                                    <li>
                                        <a href="/admin/ulist?currPage=${pageDTO.currPage+1}">
                                            <span><i class="fa fa-angle-right"></i></span>
                                        </a>
                                    </li>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>

        </div>

        </div>
        <footer class="cm-footer"><span class="pull-left">懒哎</span><span class="pull-right">&copy;  2016-3-6</span></footer>
    </div>
    <script src="assets/js/lib/jquery-2.1.3.min.js"></script>
    <script src="assets/js/jquery.mousewheel.min.js"></script>
    <script src="assets/js/jquery.cookie.min.js"></script>
    <script src="assets/js/fastclick.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/clearmin.min.js"></script>
    <script src="assets/js/demo/home.js"></script>

</body>
</html>