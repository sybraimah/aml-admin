<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%--<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@page session="false"%>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Light Blue - Admin Template</title>
    <link href="resources/css/application.min.css" rel="stylesheet" />
    <link rel="shortcut icon" href="/img/favicon.png" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body class="background-dark">
<div class="logo">
    <h4><a href="index.html">Light <strong>Blue</strong></a></h4>
</div>
<nav id="sidebar" class="sidebar nav-collapse collapse">
    <ul id="side-nav" class="side-nav">
        <li class="active">
            <a href="index.html"><i class="icon-desktop"></i> <span class="name">Dashboard</span></a>
        </li>

    </ul>
    <%--<div id="sidebar-settings" class="settings">--%>
        <%--<button type="button" data-value="icons" class="btn-icons btn btn-transparent btn-small">Icons</button>--%>
        <%--<button type="button" data-value="auto" class="btn-auto btn btn-transparent btn-small">Auto</button>--%>
    <%--</div>--%>
</nav>
<div class="wrap">
    <header class="page-header">
        <div class="navbar">
            <div class="navbar-inner">
                <%--<ul class="nav pull-right">--%>
                    <%--<li class="visible-phone-landscape">--%>
                        <%--<a href="#" id="search-toggle">--%>
                            <%--<i class="icon-search"></i>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="dropdown">--%>
                        <%--<a href="#" title="Messages" id="messages" class="dropdown-toggle" data-toggle="dropdown">--%>
                            <%--<i class="icon-comments"></i>--%>
                        <%--</a>--%>
                        <%--<ul id="messages-menu" class="dropdown-menu messages" role="menu">--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="message">--%>
                                    <%--<img src="img/1.jpg" alt="" />--%>
                                    <%--<div class="details">--%>
                                        <%--<div class="sender">Jane Hew</div>--%>
                                        <%--<div class="text">--%>
                                            <%--Hey, John! How is it going? ...--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="message">--%>
                                    <%--<img src="img/2.jpg" alt="" />--%>
                                    <%--<div class="details">--%>
                                        <%--<div class="sender">Alies Rumiancaŭ</div>--%>
                                        <%--<div class="text">--%>
                                            <%--I'll definitely buy this template--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="message">--%>
                                    <%--<img src="img/3.jpg" alt="" />--%>
                                    <%--<div class="details">--%>
                                        <%--<div class="sender">Michał Rumiancaŭ</div>--%>
                                        <%--<div class="text">--%>
                                            <%--Is it really Lore ipsum? Lore ...--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="text-align-center see-all">--%>
                                    <%--See all messages <i class="icon-arrow-right"></i>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                    <%--<li class="dropdown">--%>
                        <%--<a href="#" title="8 support tickets" class="dropdown-toggle" data-toggle="dropdown">--%>
                            <%--<i class="icon-group"></i>--%>
                            <%--<span class="count">8</span>--%>
                        <%--</a>--%>
                        <%--<ul id="support-menu" class="dropdown-menu support" role="menu">--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="support-ticket">--%>
                                    <%--<div class="picture">--%>
                                        <%--<span class="label label-important"><i class="icon-bell-alt"></i></span>--%>
                                    <%--</div>--%>
                                    <%--<div class="details">--%>
                                        <%--Check out this awesome ticket--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="support-ticket">--%>
                                    <%--<div class="picture">--%>
                                        <%--<span class="label label-warning"><i class="icon-question-sign"></i></span>--%>
                                    <%--</div>--%>
                                    <%--<div class="details">--%>
                                        <%--"What is the best way to get ...--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="support-ticket">--%>
                                    <%--<div class="picture">--%>
                                        <%--<span class="label label-success"><i class="icon-tag"></i></span>--%>
                                    <%--</div>--%>
                                    <%--<div class="details">--%>
                                        <%--This is just a simple notification--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="support-ticket">--%>
                                    <%--<div class="picture">--%>
                                        <%--<span class="label label-info"><i class="icon-info-sign"></i></span>--%>
                                    <%--</div>--%>
                                    <%--<div class="details">--%>
                                        <%--12 new orders has arrived today--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="support-ticket">--%>
                                    <%--<div class="picture">--%>
                                        <%--<span class="label label-important"><i class="icon-plus"></i></span>--%>
                                    <%--</div>--%>
                                    <%--<div class="details">--%>
                                        <%--One more thing that just happened--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="text-align-center see-all">--%>
                                    <%--See all tickets <i class="icon-arrow-right"></i>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                    <%--<li class="divider"></li>--%>
                    <%--<li class="hidden-phone">--%>
                        <%--<a href="#" id="settings" title="Settings" data-toggle="popover" data-placement="bottom">--%>
                            <%--<i class="icon-cog"></i>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="hidden-phone dropdown">--%>
                        <%--<a href="#" title="Account" id="account" class="dropdown-toggle" data-toggle="dropdown">--%>
                            <%--<i class="icon-user"></i>--%>
                        <%--</a>--%>
                        <%--<ul id="account-menu" class="dropdown-menu account" role="menu">--%>
                            <%--<li role="presentation" class="account-picture">--%>
                                <%--<img src="img/2.jpg" alt="" />--%>
                                <%--Philip Daineka--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="form_account.html" class="link">--%>
                                    <%--<i class="icon-user"></i>--%>
                                    <%--Profile--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="component_calendar.html" class="link">--%>
                                    <%--<i class="icon-calendar"></i>--%>
                                    <%--Calendar--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li role="presentation">--%>
                                <%--<a href="#" class="link">--%>
                                    <%--<i class="icon-inbox"></i>--%>
                                    <%--Inbox--%>
                                <%--</a>--%>
                            <%--</li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                    <%--<li class="visible-phone">--%>
                        <%--<a href="#" class="btn-navbar" data-toggle="collapse" data-target=".sidebar" title="">--%>
                            <%--<i class="icon-reorder"></i>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="hidden-phone"><a href="login.html"><i class="icon-signout"></i></a></li>--%>
                <%--</ul>--%>
                <%--<form id="search-form" class="navbar-search pull-right" />--%>
                    <%--<input type="search" class="search-query" placeholder="Search..." />--%>
                <%--</form>--%>
                <%--<div class="notifications pull-right">--%>
                    <%--<div class="alert pull-right">--%>
                        <%--<a href="#" class="close" data-dismiss="alert">&times;</a>--%>
                        <%--<i class="icon-info-sign"></i> Check out Light Blue <a id="notification-link" href="#">settings</a> on the right!--%>
                    <%--</div>--%>
                <%--</div>--%>
            </div>
        </div>
    </header>
    <div class="content container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <h2 class="page-title">Dashboard <small>Statistics and more</small></h2>
            </div>
        </div>
        <div class="row-fluid box-row">
            <div class="span2">
                <div class="box">
                    <div class="icon">
                        <i class="icon-circle-arrow-up"></i>
                    </div>
                    <div class="description">
                        <strong id="flagged">0</strong> Flagged
                    </div>
                </div>
            </div>
            <div class="span2">
                <div class="box">
                    <div class="icon">
                        <i class="icon-circle-arrow-up"></i>
                    </div>
                    <div class="description">
                        <strong id="transactions">0</strong> Transactions
                    </div>
                </div>
            </div>
        </div>
        <div class="row-fluid">
            <div class="span8">
                <section class="widget">
                    <header>
                        <h4>
                            <i class="icon-circle-arrow-up"></i>
                            Transactions this month
                            <small>

                                <%--Based on a three months data--%>
                            </small>
                        </h4>
                    </header>
                    <div class="body no-margin">

                        <div id="visits-chart" class="chart visits-chart">
                            <div id="monthly-stats" class="chart" style="height: 250px;"></div>

                            <%--<svg><g class="nvd3 nv-wrap nv-lineChart" transform="translate(25,28)"><g>
                                    <g class="nv-x nv-axis" transform="translate(0,147)"><g class="nvd3 nv-wrap nv-axis"><g>
                                        <g transform="translate(5.472458817049808,0)" style="opacity: 1;"><line class="tick" y2="6" x2="0">

                                        </line><text y="13" dy=".71em" text-anchor="middle" x="0">Jun 17</text></g>
                                        <g transform="translate(140.56984068167304,0)" style="opacity: 1;"><line class="tick" y2="6" x2="0">

                                        </line><text y="13" dy=".71em" text-anchor="middle" x="0">Jun 29</text></g><g transform="translate(275.6672225462963,0)" style="opacity: 1;"><line class="tick" y2="6" x2="0"></line><text y="13" dy=".71em" text-anchor="middle" x="0">Jul 10</text></g><g transform="translate(410.7646044109195,0)" style="opacity: 1;"><line class="tick" y2="6" x2="0"></line><text y="13" dy=".71em" text-anchor="middle" x="0">Jul 22</text></g><g transform="translate(545.8619862755428,0)" style="opacity: 1;"><line class="tick" y2="6" x2="0"></line><text y="13" dy=".71em" text-anchor="middle" x="0">Aug 02</text></g><path class="domain" d="M0,6V0H677V6"></path><text class="nv-axislabel" text-anchor="middle" y="36" x="338.5"></text></g></g></g><g class="nv-y nv-axis"><g class="nvd3 nv-wrap nv-axis"><g><g transform="translate(0,76.64735516372797)" style="opacity: 1;"><line class="tick" x2="677" y2="0"></line><text x="-3" dy=".32em" text-anchor="end" y="0">200</text></g><g transform="translate(0,2.591939546599491)" style="opacity: 1;"><line class="tick" x2="677" y2="0"></line><text x="-3" dy=".32em" text-anchor="end" y="0">400</text></g><path class="domain" d="M0,0H0V147H0"></path><text class="nv-axislabel" text-anchor="middle" transform="rotate(-90)" y="-63" x="-73.5"></text></g></g></g><g class="nv-linesWrap"><g class="nvd3 nv-wrap nv-line" transform="translate(0,0)"><defs><clipPath id="nv-edge-clip-58206"><rect width="677" height="147"></rect></clipPath></defs><g clip-path=""><g class="nv-groups"><g class="nv-group nv-series-0" style="stroke-opacity: 1; fill-opacity: 0.5; fill: rgb(234, 200, 94); stroke: rgb(234, 200, 94);"><path class="nv-area" d="M0,147L23.344827586206897,147L46.689655172413794,147L70.03448275862068,147L93.37931034482759,147L116.72413793103448,147L140.06896551724137,147L163.41379310344826,147L186.75862068965517,147L210.10344827586206,147L233.44827586206895,147L256.7931034482759,147L280.13793103448273,147L303.48275862068965,147L326.8275862068965,147L350.1724137931035,147L373.51724137931035,147L396.8620689655172,147L420.2068965517241,147L443.55172413793105,147L466.8965517241379,147L490.2413793103448,147L513.5862068965517,147L536.9310344827586,147L560.2758620689655,147L583.6206896551723,147L606.9655172413793,147L630.3103448275862,147L653.655172413793,147L677,147L677,145.14861460957178L653.655172413793,146.25944584382873L630.3103448275862,143.6675062972292L606.9655172413793,136.632241813602L583.6206896551723,127.7455919395466L560.2758620689655,105.15869017632242L536.9310344827586,78.12846347607052L513.5862068965517,47.76574307304787L490.2413793103448,26.659949622166252L466.8965517241379,8.516372795969772L443.55172413793105,0L420.2068965517241,63.68765743073048L396.8620689655172,108.4911838790932L373.51724137931035,128.85642317380353L350.1724137931035,137.3727959697733L326.8275862068965,141.81612090680102L303.48275862068965,146.25944584382873L280.13793103448273,145.14861460957178L256.7931034482759,146.62972292191435L233.44827586206895,145.88916876574308L210.10344827586206,145.14861460957178L186.75862068965517,144.03778337531486L163.41379310344826,145.14861460957178L140.06896551724137,145.51889168765743L116.72413793103448,144.03778337531486L93.37931034482759,146.25944584382873L70.03448275862068,146.62972292191435L46.689655172413794,145.88916876574308L23.344827586206897,143.2972292191436L0,117.74811083123426Z"></path><path class="nv-line" d="M0,117.74811083123426L23.344827586206897,143.2972292191436L46.689655172413794,145.88916876574308L70.03448275862068,146.62972292191435L93.37931034482759,146.25944584382873L116.72413793103448,144.03778337531486L140.06896551724137,145.51889168765743L163.41379310344826,145.14861460957178L186.75862068965517,144.03778337531486L210.10344827586206,145.14861460957178L233.44827586206895,145.88916876574308L256.7931034482759,146.62972292191435L280.13793103448273,145.14861460957178L303.48275862068965,146.25944584382873L326.8275862068965,141.81612090680102L350.1724137931035,137.3727959697733L373.51724137931035,128.85642317380353L396.8620689655172,108.4911838790932L420.2068965517241,63.68765743073048L443.55172413793105,0L466.8965517241379,8.516372795969772L490.2413793103448,26.659949622166252L513.5862068965517,47.76574307304787L536.9310344827586,78.12846347607052L560.2758620689655,105.15869017632242L583.6206896551723,127.7455919395466L606.9655172413793,136.632241813602L630.3103448275862,143.6675062972292L653.655172413793,146.25944584382873L677,145.14861460957178"></path></g><g class="nv-group nv-series-1" style="stroke-opacity: 1; fill-opacity: 0.5; fill: rgb(207, 109, 81); stroke: rgb(207, 109, 81);"><path class="nv-line" d="M0,96.27204030226702L23.344827586206897,93.30982367758186L46.689655172413794,98.12342569269522L70.03448275862068,140.33501259445845L93.37931034482759,145.51889168765743L116.72413793103448,147L140.06896551724137,144.4080604534005L163.41379310344826,145.88916876574308L186.75862068965517,143.6675062972292L210.10344827586206,146.25944584382873L233.44827586206895,144.77833753148616L256.7931034482759,145.51889168765743L280.13793103448273,146.62972292191435L303.48275862068965,135.5214105793451L326.8275862068965,57.392947103274565L350.1724137931035,88.86649874055416L373.51724137931035,142.92695214105794L396.8620689655172,146.62972292191435L420.2068965517241,144.03778337531486L443.55172413793105,145.51889168765743L466.8965517241379,147L490.2413793103448,144.4080604534005L513.5862068965517,145.14861460957178L536.9310344827586,146.62972292191435L560.2758620689655,146.62972292191435L583.6206896551723,147L606.9655172413793,146.25944584382873L630.3103448275862,145.51889168765743L653.655172413793,144.03778337531486L677,147"></path></g></g><g class="nv-scatterWrap" clip-path=""><g class="nvd3 nv-wrap nv-scatter nv-chart-58206" transform="translate(0,0)"><defs><clipPath id="nv-edge-clip-58206"><rect width="677" height="147"></rect></clipPath><clipPath class="nv-point-clips" id="nv-points-clip-58206"><circle r="25" cx="0" cy="117.74811083130555"></circle><circle r="25" cx="23.34482758622092" cy="143.29722921916053"></circle><circle r="25" cx="46.689655172454415" cy="145.88916876583315"></circle><circle r="25" cx="70.0344827586479" cy="146.62972292197614"></circle><circle r="25" cx="93.37931034483316" cy="146.25944584389927"></circle><circle r="25" cx="116.72413793107647" cy="144.0377833753499"></circle><circle r="25" cx="140.06896551729585" cy="145.51889168767553"></circle><circle r="25" cx="163.41379310351488" cy="145.1486146096327"></circle><circle r="25" cx="186.7586206897073" cy="144.03778337533393"></circle><circle r="25" cx="210.1034482759873" cy="145.14861460966844"></circle><circle r="25" cx="233.4482758622352" cy="145.88916876584"></circle><circle r="25" cx="256.79310344848" cy="146.62972292192484"></circle><circle r="25" cx="280.1379310347499" cy="145.14861460970312"></circle><circle r="25" cx="303.4827586209818" cy="146.25944584384126"></circle><circle r="25" cx="326.8275862070502" cy="141.81612090691692"></circle><circle r="25" cx="350.17241379331693" cy="137.3727959698064"></circle><circle r="25" cx="373.51724137941835" cy="128.85642317384693"></circle><circle r="25" cx="396.8620689656286" cy="108.49118387912982"></circle><circle r="25" cx="420.2068965517679" cy="63.6876574307776"></circle><circle r="25" cx="443.5517241379676" cy="0"></circle><circle r="25" cx="466.8965517242016" cy="8.516372795970584"></circle><circle r="25" cx="490.2413793104319" cy="26.65994962218362"></circle><circle r="25" cx="513.5862068969178" cy="47.76574307304996"></circle><circle r="25" cx="536.9310344829859" cy="78.12846347614186"></circle><circle r="25" cx="560.2758620690489" cy="105.15869017636065"></circle><circle r="25" cx="583.6206896556722" cy="127.7455919396355"></circle><circle r="25" cx="606.9655172417881" cy="136.6322418137279"></circle><circle r="25" cx="630.3103448276983" cy="143.66750629730197"></circle><circle r="25" cx="653.65517241419" cy="146.25944584393474"></circle><circle r="25" cx="677.0000000000485" cy="145.14861460960543"></circle><circle r="25" cx="0" cy="96.27204030231802"></circle><circle r="25" cx="23.344827586220344" cy="93.30982367766244"></circle><circle r="25" cx="46.68965517245889" cy="98.12342569271335"></circle><circle r="25" cx="70.03448275867048" cy="140.33501259448312"></circle><circle r="25" cx="93.37931034488314" cy="145.51889168769756"></circle><circle r="25" cx="116.72413793107525" cy="147.0000000001101"></circle><circle r="25" cx="140.0689655173037" cy="144.4080604534159"></circle><circle r="25" cx="163.4137931034541" cy="145.8891687657889"></circle><circle r="25" cx="186.75862068972398" cy="143.6675062972943"></circle><circle r="25" cx="210.1034482759769" cy="146.25944584394696"></circle><circle r="25" cx="233.44827586208683" cy="144.77833753156247"></circle><circle r="25" cx="256.79310344842924" cy="145.51889168776728"></circle><circle r="25" cx="280.13793103452196" cy="146.62972292205055"></circle><circle r="25" cx="303.4827586209724" cy="135.521410579438"></circle><circle r="25" cx="326.8275862070938" cy="57.39294710330775"></circle><circle r="25" cx="350.1724137933447" cy="88.86649874060292"></circle><circle r="25" cx="373.51724137957103" cy="142.92695214116767"></circle><circle r="25" cx="396.8620689657139" cy="146.62972292202284"></circle><circle r="25" cx="420.2068965519218" cy="144.0377833754353"></circle><circle r="25" cx="443.551724138283" cy="145.51889168772547"></circle><circle r="25" cx="466.89655172450125" cy="147.00000000006258"></circle><circle r="25" cx="490.2413793106223" cy="144.4080604534773"></circle><circle r="25" cx="513.586206896841" cy="145.1486146096092"></circle><circle r="25" cx="536.9310344827593" cy="146.6297229219218"></circle><circle r="25" cx="560.275862069172" cy="146.62972292200382"></circle><circle r="25" cx="583.6206896557501" cy="147.00000000005264"></circle><circle r="25" cx="606.9655172417135" cy="146.2594458438958"></circle><circle r="25" cx="630.3103448279938" cy="145.51889168770919"></circle><circle r="25" cx="653.6551724139797" cy="144.03778337533967"></circle><circle r="25" cx="677.0000000000006" cy="147.0000000000733"></circle></clipPath></defs><g clip-path=""><g class="nv-groups"><g class="nv-group nv-series-0" style="stroke-opacity: 1; fill-opacity: 0.5; stroke: rgb(234, 200, 94); fill: rgb(234, 200, 94);"><circle cx="0" cy="117.74811083123426" r="2.256758334191025" class="nv-point nv-point-0"></circle><circle cx="23.344827586206897" cy="143.2972292191436" r="2.256758334191025" class="nv-point nv-point-1"></circle><circle cx="46.689655172413794" cy="145.88916876574308" r="2.256758334191025" class="nv-point nv-point-2"></circle><circle cx="70.03448275862068" cy="146.62972292191435" r="2.256758334191025" class="nv-point nv-point-3"></circle><circle cx="93.37931034482759" cy="146.25944584382873" r="2.256758334191025" class="nv-point nv-point-4"></circle><circle cx="116.72413793103448" cy="144.03778337531486" r="2.256758334191025" class="nv-point nv-point-5"></circle><circle cx="140.06896551724137" cy="145.51889168765743" r="2.256758334191025" class="nv-point nv-point-6"></circle><circle cx="163.41379310344826" cy="145.14861460957178" r="2.256758334191025" class="nv-point nv-point-7"></circle><circle cx="186.75862068965517" cy="144.03778337531486" r="2.256758334191025" class="nv-point nv-point-8"></circle><circle cx="210.10344827586206" cy="145.14861460957178" r="2.256758334191025" class="nv-point nv-point-9"></circle><circle cx="233.44827586206895" cy="145.88916876574308" r="2.256758334191025" class="nv-point nv-point-10"></circle><circle cx="256.7931034482759" cy="146.62972292191435" r="2.256758334191025" class="nv-point nv-point-11"></circle><circle cx="280.13793103448273" cy="145.14861460957178" r="2.256758334191025" class="nv-point nv-point-12"></circle><circle cx="303.48275862068965" cy="146.25944584382873" r="2.256758334191025" class="nv-point nv-point-13"></circle><circle cx="326.8275862068965" cy="141.81612090680102" r="2.256758334191025" class="nv-point nv-point-14"></circle><circle cx="350.1724137931035" cy="137.3727959697733" r="2.256758334191025" class="nv-point nv-point-15"></circle><circle cx="373.51724137931035" cy="128.85642317380353" r="2.256758334191025" class="nv-point nv-point-16"></circle><circle cx="396.8620689655172" cy="108.4911838790932" r="2.256758334191025" class="nv-point nv-point-17"></circle><circle cx="420.2068965517241" cy="63.68765743073048" r="2.256758334191025" class="nv-point nv-point-18"></circle><circle cx="443.55172413793105" cy="0" r="2.256758334191025" class="nv-point nv-point-19"></circle><circle cx="466.8965517241379" cy="8.516372795969772" r="2.256758334191025" class="nv-point nv-point-20"></circle><circle cx="490.2413793103448" cy="26.659949622166252" r="2.256758334191025" class="nv-point nv-point-21"></circle><circle cx="513.5862068965517" cy="47.76574307304787" r="2.256758334191025" class="nv-point nv-point-22"></circle><circle cx="536.9310344827586" cy="78.12846347607052" r="2.256758334191025" class="nv-point nv-point-23"></circle><circle cx="560.2758620689655" cy="105.15869017632242" r="2.256758334191025" class="nv-point nv-point-24"></circle><circle cx="583.6206896551723" cy="127.7455919395466" r="2.256758334191025" class="nv-point nv-point-25"></circle><circle cx="606.9655172413793" cy="136.632241813602" r="2.256758334191025" class="nv-point nv-point-26"></circle><circle cx="630.3103448275862" cy="143.6675062972292" r="2.256758334191025" class="nv-point nv-point-27"></circle><circle cx="653.655172413793" cy="146.25944584382873" r="2.256758334191025" class="nv-point nv-point-28"></circle><circle cx="677" cy="145.14861460957178" r="2.256758334191025" class="nv-point nv-point-29"></circle></g><g class="nv-group nv-series-1" style="stroke-opacity: 1; fill-opacity: 0.5; stroke: rgb(207, 109, 81); fill: rgb(207, 109, 81);"><circle cx="0" cy="96.27204030226702" r="2.256758334191025" class="nv-point nv-point-0"></circle><circle cx="23.344827586206897" cy="93.30982367758186" r="2.256758334191025" class="nv-point nv-point-1"></circle><circle cx="46.689655172413794" cy="98.12342569269522" r="2.256758334191025" class="nv-point nv-point-2"></circle><circle cx="70.03448275862068" cy="140.33501259445845" r="2.256758334191025" class="nv-point nv-point-3"></circle><circle cx="93.37931034482759" cy="145.51889168765743" r="2.256758334191025" class="nv-point nv-point-4"></circle><circle cx="116.72413793103448" cy="147" r="2.256758334191025" class="nv-point nv-point-5"></circle><circle cx="140.06896551724137" cy="144.4080604534005" r="2.256758334191025" class="nv-point nv-point-6"></circle><circle cx="163.41379310344826" cy="145.88916876574308" r="2.256758334191025" class="nv-point nv-point-7"></circle><circle cx="186.75862068965517" cy="143.6675062972292" r="2.256758334191025" class="nv-point nv-point-8"></circle><circle cx="210.10344827586206" cy="146.25944584382873" r="2.256758334191025" class="nv-point nv-point-9"></circle><circle cx="233.44827586206895" cy="144.77833753148616" r="2.256758334191025" class="nv-point nv-point-10"></circle><circle cx="256.7931034482759" cy="145.51889168765743" r="2.256758334191025" class="nv-point nv-point-11"></circle><circle cx="280.13793103448273" cy="146.62972292191435" r="2.256758334191025" class="nv-point nv-point-12"></circle><circle cx="303.48275862068965" cy="135.5214105793451" r="2.256758334191025" class="nv-point nv-point-13"></circle><circle cx="326.8275862068965" cy="57.392947103274565" r="2.256758334191025" class="nv-point nv-point-14"></circle><circle cx="350.1724137931035" cy="88.86649874055416" r="2.256758334191025" class="nv-point nv-point-15"></circle><circle cx="373.51724137931035" cy="142.92695214105794" r="2.256758334191025" class="nv-point nv-point-16"></circle><circle cx="396.8620689655172" cy="146.62972292191435" r="2.256758334191025" class="nv-point nv-point-17"></circle><circle cx="420.2068965517241" cy="144.03778337531486" r="2.256758334191025" class="nv-point nv-point-18"></circle><circle cx="443.55172413793105" cy="145.51889168765743" r="2.256758334191025" class="nv-point nv-point-19"></circle><circle cx="466.8965517241379" cy="147" r="2.256758334191025" class="nv-point nv-point-20"></circle><circle cx="490.2413793103448" cy="144.4080604534005" r="2.256758334191025" class="nv-point nv-point-21"></circle><circle cx="513.5862068965517" cy="145.14861460957178" r="2.256758334191025" class="nv-point nv-point-22"></circle><circle cx="536.9310344827586" cy="146.62972292191435" r="2.256758334191025" class="nv-point nv-point-23"></circle><circle cx="560.2758620689655" cy="146.62972292191435" r="2.256758334191025" class="nv-point nv-point-24"></circle><circle cx="583.6206896551723" cy="147" r="2.256758334191025" class="nv-point nv-point-25"></circle><circle cx="606.9655172413793" cy="146.25944584382873" r="2.256758334191025" class="nv-point nv-point-26"></circle><circle cx="630.3103448275862" cy="145.51889168765743" r="2.256758334191025" class="nv-point nv-point-27"></circle><circle cx="653.655172413793" cy="144.03778337531486" r="2.256758334191025" class="nv-point nv-point-28"></circle><circle cx="677" cy="147" r="2.256758334191025" class="nv-point nv-point-29"></circle></g></g><g class="nv-point-paths" clip-path="url(#nv-points-clip-58206)"><path class="nv-path-0" d="M-10.000000000000004,107.01007556681179L-10,150.3252618680708L25.045326687385955,118.30352644841145L13.222896447506791,107.01007556681179Z"></path><path class="nv-path-1" d="M-9.999999999999996,150.32526186800686L-9.999999999999996,157L33.63973374685461,157.00000000000006L37.525029612112384,122.00629722927239L30.35992037580814,118.30352644841142L25.045326687385955,118.30352644841146Z"></path><path class="nv-path-2" d="M37.525029612112384,122.00629722927239L33.63973374685429,157L58.02135271951303,157L58.450164570914616,143.48236775818808L53.34061945973348,122.00629722927387Z"></path><path class="nv-path-3" d="M58.4501645709146,143.48236775818805L58.02135271951302,157L81.87431815458353,157L81.69808699119162,145.88916876501006L81.5835627042547,143.48236775827104Z"></path><path class="nv-path-4" d="M81.69808699119162,145.88916876501006L81.87431815458353,157L104.7227539726019,157.00000000000006L105.07521629936201,145.88916876658777Z"></path><path class="nv-path-5" d="M101.6210496957096,90.70497727050804L105.09870846084294,145.51889168772522L128.3495674013225,145.5188916877348L128.38480564347694,144.9634760704632L129.93031228847576,47.52404949479344Z"></path><path class="nv-path-6" d="M128.38480564347694,144.9634760704632L128.3495674013225,145.5188916877348L129.07798421633015,157L151.56221162679861,157L151.7443158305689,145.51889168675328L151.73550627004934,144.9634760706281Z"></path><path class="nv-path-7" d="M158.08453145275672,-9.999999999999998L156.5288243312504,-6.1384828681529475L151.7355062700494,144.96347607062808L151.74431583056892,145.51889168675328L175.1302546993414,145.5188916886722L175.050968654439,143.8526448357866L165.28981576949994,-10Z"></path><path class="nv-path-8" d="M175.05096865443898,143.8526448357866L175.13025469934135,145.5188916886722L176.04077571798192,157L197.30317101820393,157L198.378177119628,145.70403022669788L198.46627272497108,143.85264483684165Z"></path><path class="nv-path-9" d="M206.40504218085795,18.72391343589606L198.46627272497108,143.85264483684165L198.378177119628,145.70403022669788L221.76998902874982,145.70403022691693L221.78173510941974,145.3337531502594L220.06166498917437,36.88863794483406Z"></path><path class="nv-path-10" d="M221.78173510941977,145.3337531502594L221.76998902874982,145.70403022691693L221.94915671231942,157L244.77997340934627,156.99999999999994L245.12656269569743,146.07430730537916L245.11481661494983,145.33375314714309Z"></path><path class="nv-path-11" d="M245.12656269569743,146.07430730537916L244.77997340934627,157L268.4655172414451,157L268.46551724150396,146.07430730431267Z"></path><path class="nv-path-12" d="M267.89155457712457,82.33478400077726L267.462658348186,82.10659341659189L268.47432680209715,145.8891687640818L291.801535267242,145.88916876767186L292.039393401789,140.89042821164972Z"></path><path class="nv-path-13" d="M292.039393401789,140.89042821164972L291.801535267242,145.88916876767186L291.97776643065265,157L317.6223287960304,157L314.5561222975444,140.89042821162994Z"></path><path class="nv-path-14" d="M323.25727128194245,108.62098096561176L314.55612229754445,140.8904282116299L317.62232879603044,157L341.8128741937903,157L333.4609313732503,113.11964735519511Z"></path><path class="nv-path-15" d="M333.4609313732503,113.11964735519508L341.8128741937903,157L357.8358782525008,157L362.8579270481178,135.89168765762298L354.5505114621725,113.11964735520715Z"></path><path class="nv-path-16" d="M371.64093860854445,103.1428074196775L354.5505114621725,113.11964735520712L362.85792704811774,135.89168765762298L386.59918485850403,135.89168765736537L392.94206844462883,127.56045340058509Z"></path><path class="nv-path-17" d="M384.14938801934494,73.3835941835016L371.64093860854445,103.1428074196775L392.94206844462883,127.56045340058509L406.56114119865725,127.56045340055465L434.11998083643863,109.46149684947375L439.75457851344584,102.35661679759451Z"></path><path class="nv-path-18" d="M376.8123404544137,11.658929950909197L374.46693373447255,46.45202615266847L384.14938801934477,73.38359418350157L439.75457851344584,102.35661679759451L458.34604195862767,97.05284113479595L472.2991095229672,89.23330452004899L472.56966860890583,88.99856255977787L469.79692177416047,72.73687559343924L455.99551192327937,46.63278604938023L443.59416236819936,36.137929200710744Z"></path><path class="nv-path-19" d="M366.1627024016319,-10L376.81234045441363,11.658929950909197L443.59416236819936,36.13792920071073L460.42563407883443,-10Z"></path><path class="nv-path-20" d="M460.4256340787979,-9.999999999883585L443.59416236819936,36.13792920071073L455.9955119232793,46.63278604938017L500.010457022959,-9.999999999999993Z"></path><path class="nv-path-21" d="M500.0104570229589,-10L455.99551192327937,46.63278604938023L469.79692177416047,72.73687559343924L544.598391203561,-10Z"></path><path class="nv-path-22" d="M544.598391203561,-10L469.79692177416047,72.73687559343924L472.56966860890583,88.99856255977787L486.87972467440136,92.45528628758524L620.1349907456399,-10.000000000000014Z"></path><path class="nv-path-23" d="M620.1349907456398,-10.000000000000007L486.87972467440136,92.45528628758524L503.20871271961414,103.95799384637345L525.396367744309,111.68651985433269L661.1607968011984,-5.56729469202169L663.6637631742303,-10Z"></path><path class="nv-path-24" d="M525.396367744309,111.68651985433269L527.2884474369959,113.89559000542388L548.6034482760385,125.89420654921686L562.812761586221,125.89420654917468L620.3119259664559,66.46560085106962L648.7084606648051,24.34056747566393L661.1607968011982,-5.567294692021505Z"></path><path class="nv-path-25" d="M562.812761586221,125.89420654917467L572.0980383915625,137.3727959698907L593.3197618885805,137.37279596980486L620.3119259664559,66.46560085106962Z"></path><path class="nv-path-26" d="M593.3197618885804,137.37279596980486L595.128658318718,141.44584382872014L618.2473738509335,141.44584382889923L643.3416866903098,58.17642190597L648.7084606648051,24.34056747566393L620.3119259664559,66.46560085106962Z"></path><path class="nv-path-27" d="M618.2473738509336,141.44584382889923L618.5968197524089,144.59319899437574L641.9710125401546,144.59319899064388L643.3416866903099,58.17642190597Z"></path><path class="nv-path-28" d="M642.0062507824896,145.14861461073997L641.6302962942998,157L664.9986160417452,156.99999999999977L665.3452053281784,146.07430730453734L665.3011575254552,145.1486146085347Z"></path><path class="nv-path-29" d="M687,-10L672.6836891130121,-10L665.3011575254552,145.1486146085347L665.3452053281784,146.07430730453734L687,146.0743073050985Z"></path><path class="nv-path-30" d="M-1.6244691976696775,-10L-9.999999999999998,-10L-10,107.01007556681179L13.222896447506791,107.01007556681179Z"></path><path class="nv-path-31" d="M-1.6244691976696686,-10L13.222896447506791,107.01007556681178L25.045326687385955,118.30352644841146L30.35992037580814,118.30352644841139L56.81555005089213,-10Z"></path><path class="nv-path-32" d="M56.81555005089214,-10L30.359920375808144,118.30352644841139L37.52502961211232,122.00629722927238L53.34061945973348,122.00629722927387L90.97413075677304,101.1933428445549L101.62104969570959,90.70497727050805L129.9303122884757,47.52404949479344L156.52882433125046,-6.1384828681529475L158.08453145275678,-10Z"></path><path class="nv-path-33" d="M53.34061945973348,122.00629722927386L58.4501645709146,143.48236775818805L81.58356270425469,143.48236775827104L90.97413075677306,101.1933428445549Z"></path><path class="nv-path-34" d="M90.97413075677306,101.1933428445549L81.58356270425472,143.48236775827104L81.69808699119162,145.88916876501006L105.07521629936201,145.88916876658777L105.09870846084294,145.51889168772522L101.62104969570959,90.70497727050805Z"></path><path class="nv-path-35" d="M105.09870846084294,145.51889168772522L105.07521629936201,145.88916876658777L104.7227539726019,157L129.07798421633015,157L128.3495674013225,145.5188916877348Z"></path><path class="nv-path-36" d="M129.93031228847576,47.52404949479344L128.38480564347694,144.9634760704632L151.73550627004934,144.9634760706281L156.52882433125046,-6.1384828681529475Z"></path><path class="nv-path-37" d="M151.74431583056892,145.51889168675328L151.56221162679864,157L176.04077571798194,157L175.1302546993414,145.5188916886722Z"></path><path class="nv-path-38" d="M188.71273638810297,-10L165.28981576949994,-10L175.05096865443898,143.8526448357866L198.46627272497102,143.85264483684165L206.40504218085795,18.72391343589606Z"></path><path class="nv-path-39" d="M198.378177119628,145.70403022669788L197.30317101820393,157L221.94915671231942,157L221.76998902874982,145.70403022691693Z"></path><path class="nv-path-40" d="M220.06166498917437,36.88863794483406L221.78173510941977,145.3337531502594L245.11481661494983,145.33375314714309L247.62075056454415,66.33805039416026Z"></path><path class="nv-path-41" d="M247.62075056454418,66.33805039416029L245.11481661494983,145.33375314714309L245.12656269569743,146.07430730537916L268.46551724150396,146.07430730431267L268.47432680209715,145.8891687640818L267.462658348186,82.10659341659186Z"></path><path class="nv-path-42" d="M268.4743268020972,145.8891687640818L268.465517241504,146.07430730431264L268.4655172414452,157L291.97776643065265,156.99999999999955L291.801535267242,145.88916876767186Z"></path><path class="nv-path-43" d="M267.89155457712457,82.33478400077729L292.039393401789,140.89042821164972L314.5561222975444,140.89042821162994L323.2572712819424,108.62098096561174L309.3774053714677,94.73077889133837Z"></path><path class="nv-path-44" d="M366.1627024016319,-10L188.71273638810297,-9.999999999999996L206.40504218085795,18.72391343589606L220.0616649891742,36.88863794483406L247.62075056454415,66.33805039416026L267.462658348186,82.10659341659189L267.89155457712457,82.33478400077726L309.3774053714677,94.73077889133839L374.46693373447255,46.45202615266847L376.8123404544137,11.658929950909197Z"></path><path class="nv-path-45" d="M309.3774053714677,94.73077889133837L323.2572712819424,108.62098096561174L333.4609313732503,113.11964735519508L354.5505114621725,113.11964735520715L371.64093860854445,103.1428074196775L384.14938801934494,73.3835941835016L374.4669337344726,46.45202615266845Z"></path><path class="nv-path-46" d="M362.8579270481178,135.89168765762298L357.8358782525008,157L383.25115232808326,157L386.5991848585041,135.89168765736537Z"></path><path class="nv-path-47" d="M392.9420684446289,127.56045340058508L386.59918485850403,135.89168765736537L383.2511523280832,157L409.8297678262444,157L406.5611411986573,127.56045340055464Z"></path><path class="nv-path-48" d="M406.5611411986573,127.56045340055464L409.8297678262444,157L431.10390920731214,157L434.11998083643874,109.46149684947372Z"></path><path class="nv-path-49" d="M439.75457851344584,102.35661679759451L434.11998083643874,109.46149684947372L431.10390920731214,157L454.5427054392925,157L458.34604195862767,97.05284113479595Z"></path><path class="nv-path-50" d="M458.34604195862767,97.05284113479593L454.54270543929243,157L479.8231393024937,157L472.2991095229672,89.23330452004899Z"></path><path class="nv-path-51" d="M486.87972467440136,92.45528628758527L472.5696686089059,88.99856255977788L472.2991095229672,89.23330452004899L479.8231393024937,157L501.52609253484,157.00000000000003L503.20871271961414,103.95799384637345Z"></path><path class="nv-path-52" d="M503.20871271961414,103.95799384637345L501.52609253483996,157L524.5536960362699,157L527.2884474369959,113.89559000542388L525.396367744309,111.68651985433272Z"></path><path class="nv-path-53" d="M527.2884474369959,113.89559000542388L524.5536960362699,157L548.6034482759293,157L548.6034482760385,125.89420654921688Z"></path><path class="nv-path-54" d="M548.6034482760385,125.89420654921686L548.6034482759293,157L571.7867272999906,157L572.0980383915626,137.37279596989066L562.812761586221,125.89420654917468Z"></path><path class="nv-path-55" d="M572.0980383915626,137.37279596989066L571.7867272999906,157L595.6220736140483,157L595.1286583187181,141.44584382872014L593.3197618885805,137.37279596980486Z"></path><path class="nv-path-56" d="M595.1286583187181,141.44584382872014L595.6220736140651,157L618.9903933616266,157L618.596819752409,144.59319899437574L618.2473738509335,141.44584382889923Z"></path><path class="nv-path-57" d="M618.596819752409,144.59319899437574L618.9903933616266,157L641.6302962942998,157L642.0062507824896,145.14861461073997L641.9710125401547,144.59319899064388Z"></path><path class="nv-path-58" d="M648.7084606648051,24.34056747566393L643.3416866903099,58.17642190597L641.9710125401546,144.59319899064388L642.0062507824896,145.14861461073997L665.3011575254552,145.1486146085347L672.6836891130121,-10L663.6637631742306,-10L661.1607968011984,-5.56729469202169Z"></path><path class="nv-path-59" d="M686.9999999998836,146.0743073050985L665.3452053281784,146.07430730453734L664.998616041769,157L687,157Z"></path></g></g></g></g></g></g></g><g class="nv-legendWrap" transform="translate(0,-28)"><g class="nvd3 nv-legend" transform="translate(0,3)"><g transform="translate(547,3)"><g class="nv-series" transform="translate(0,5)"><circle r="5" style="stroke-width: 2px; fill: rgb(234, 200, 94); stroke: rgb(234, 200, 94);"></circle><text text-anchor="start" dy=".32em" dx="8">Unique</text></g><g class="nv-series" transform="translate(71,5)"><circle r="5" style="stroke-width: 2px; fill: rgb(207, 109, 81); stroke: rgb(207, 109, 81);"></circle><text text-anchor="start" dy=".32em" dx="8">Visits</text></g></g></g></g></g></g></svg>
    --%>                        </div>
                        <div class="visits-info well well-small">

                        </div>
                    </div>
                </section>
            </div>
            <div class="span4">

            </div>
        </div>
    </div>
</div>

<!-- jquery and friends -->
<script src="resources/lib/jquery/jquery.1.9.0.min.js"> </script>
<script src="resources/lib/jquery/jquery-migrate-1.1.0.min.js"> </script>

<!-- jquery plugins -->
<script src="resources/lib/uniform/js/jquery.uniform.js"></script>
<script src="resources/lib/sparkline/jquery.sparkline.js"></script>
<script src="resources/lib/jquery-ui-1.10.1.custom.js"></script>
<script src="resources/lib/jquery.slimscroll.js"></script>

<!--morris-->
<%--<script src="<spring:url value='resources/lib/morris/morris.min.js'/>"></script>--%>
<%--<script src="<spring:url value='resources/lib/morris/raphael-min.js'/>"></script>--%>
<%--<script src="<spring:url value='resources/javascript/morris-converter.js'/>"></script>--%>
<%--<script src="<spring:url value='resources/javascript/stats.js'/>"></script>--%>

<!-- d3, nvd3-->
<script src="resources/lib/nvd3/lib/d3.v2.js"></script>
<script src="resources/lib/nvd3/nv.d3.custom.js"></script>

<!-- nvd3 models -->
<script src="resources/lib/nvd3/src/models/scatter.js"></script>
<script src="resources/lib/nvd3/src/models/axis.js"></script>
<script src="resources/lib/nvd3/src/models/legend.js"></script>
<script src="resources/lib/nvd3/src/models/multiBar.js"></script>
<script src="resources/lib/nvd3/src/models/multiBarChart.js"></script>
<script src="resources/lib/nvd3/src/models/line.js"></script>
<script src="resources/lib/nvd3/src/models/lineChart.js"></script>
<script src="resources/lib/nvd3/stream_layers.js"></script>

<!--backbone and friends -->
<script src="resources/lib/backbone/underscore-min.js"></script>
<script src="resources/lib/backbone/backbone-min.js"></script>
<script src="resources/lib/backbone/backbone.localStorage-min.js"></script>

<!-- bootstrap default plugins -->
<script src="resources/js/bootstrap/bootstrap-transition.js"></script>
<script src="resources/js/bootstrap/bootstrap-collapse.js"></script>
<script src="resources/js/bootstrap/bootstrap-alert.js"></script>
<script src="resources/js/bootstrap/bootstrap-tooltip.js"></script>
<script src="resources/js/bootstrap/bootstrap-popover.js"></script>
<script src="resources/js/bootstrap/bootstrap-button.js"></script>
<script src="resources/js/bootstrap/bootstrap-tab.js"> </script>
<script src="resources/js/bootstrap/bootstrap-dropdown.js"></script>

<!-- basic application js-->
<script src="resources/js/app.js"></script>
<script src="resources/js/settings.js"></script>

<!-- page specific -->
<script src="resources/js/index.js"></script>
<script src="resources/js/chat.js"></script>

<%--<script type="text/template" id="message-template">--%>
        <%--<div class="sender pull-left">--%>
            <%--<div class="icon">--%>
                <%--<img src="img/2.jpg" class="img-circle" alt="">--%>
            <%--</div>--%>
            <%--<div class="time">--%>
                <%--just now--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="chat-message-body">--%>
            <%--<span class="arrow"></span>--%>
            <%--<div class="sender">Tikhon Laninga</div>--%>
            <%--<div class="text">--%>
                <%--<%- text %>--%>
            <%--</div>--%>
        <%--</div>--%>
<%--</script>--%>

<%--<script type="text/template" id="settings-template">--%>
    <%--<div class="setting clearfix">--%>
        <%--<div>Background</div>--%>
        <%--<div id="background-toggle" class="pull-left btn-group" data-toggle="buttons-radio">--%>
            <%--<% dark = background == 'dark'; light = background == 'light';%>--%>
            <%--<button type="button" data-value="dark" class="btn btn-small btn-transparent <%= dark? 'active' : '' %>">Dark</button>--%>
            <%--<button type="button" data-value="light" class="btn btn-small btn-transparent <%= light? 'active' : '' %>">Light</button>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="setting clearfix">--%>
        <%--<div>Sidebar on the</div>--%>
        <%--<div id="sidebar-toggle" class="pull-left btn-group" data-toggle="buttons-radio">--%>
            <%--<% onRight = sidebar == 'right'%>--%>
            <%--<button type="button" data-value="left" class="btn btn-small btn-transparent <%= onRight? '' : 'active' %>">Left</button>--%>
            <%--<button type="button" data-value="right" class="btn btn-small btn-transparent <%= onRight? 'active' : '' %>">Right</button>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="setting clearfix">--%>
        <%--<div>Sidebar</div>--%>
        <%--<div id="display-sidebar-toggle" class="pull-left btn-group" data-toggle="buttons-radio">--%>
            <%--<% display = displaySidebar%>--%>
            <%--<button type="button" data-value="true" class="btn btn-small btn-transparent <%= display? 'active' : '' %>">Show</button>--%>
            <%--<button type="button" data-value="false" class="btn btn-small btn-transparent <%= display? '' : 'active' %>">Hide</button>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</script>--%>

<%--<script type="text/template" id="sidebar-settings-template">--%>
    <%--<% auto = sidebarState == 'auto'%>--%>
    <%--<% if (auto) {%>--%>
    <%--<button type="button"--%>
            <%--data-value="icons"--%>
            <%--class="btn-icons btn btn-transparent btn-small">Icons</button>--%>
    <%--<button type="button"--%>
            <%--data-value="auto"--%>
            <%--class="btn-auto btn btn-transparent btn-small">Auto</button>--%>
    <%--<%} else {%>--%>
    <%--<button type="button"--%>
            <%--data-value="auto"--%>
            <%--class="btn btn-transparent btn-small">Auto</button>--%>
    <%--<% } %>--%>
<%--</script>--%>

</body>
</html>